/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
        List<Integer> list=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
        int left=0;
        int right=list.size()-1;
        int max=Integer.MIN_VALUE;
        while(left<right){
            int currsum=list.get(left++)+list.get(right--);
            if(currsum>max)
            max=currsum;
        }
        return max;
    }
}