# Write your MySQL query statement below
select person.firstName as firstName,
person.lastName as lastName,
Address.city as city,
Address.state as state
 from Person  
left join Address
 on person.personId=Address.personId;