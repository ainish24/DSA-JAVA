/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        int changeVal=Integer.MAX_VALUE;
        if(head==null || head.next==null){
            return false;
        }
        ListNode curr=head;
        ListNode tail=null;
        while(curr!=null && curr.val!=changeVal){
            tail=curr;
            tail.val=changeVal;
            curr=curr.next;
        }
        if(curr==null) return false;
        else return true;
    }
}