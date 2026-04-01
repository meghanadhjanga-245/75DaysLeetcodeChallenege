-- Write your PostgreSQL query statement below

WITH CTE AS (
	SELECT ip, log_id,
	-- count number of digit groups on ip
	COUNT(1) OVER(PARTITION BY log_id) total_octet,
	-- count data with leading '0'
	SUM(CASE WHEN element_octet LIKE '0%'  THEN 1 ELSE 0 END) OVER(PARTITION BY log_id) total_zero_first,
	-- find the biggest number of digit groups on ip
	MAX(element_octet :: INT) OVER(PARTITION BY log_id) max_octet
	FROM(
			-- Separate each number in the IP address into separate lines for easy processing.
			SELECT log_id, ip, status_code,unnest ( string_to_array (ip, '.')) element_octet
			FROM logs
	)sub
)
SELECT  ip, COUNT(DISTINCT log_id) invalid_count 
FROM CTE
WHERE ip NOT IN (
	-- 3 correct conditions of the ip address
 	SELECT ip 
	FROM CTE
	WHERE total_zero_first = 0
	AND max_octet < 256
	AND total_octet = 4
)
GROUP BY ip
ORDER BY invalid_count DESC , ip DESC
