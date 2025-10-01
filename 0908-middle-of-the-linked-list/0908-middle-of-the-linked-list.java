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
    public ListNode middleNode(ListNode head) {
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        temp=head;
        int middle=0;
        middle=(count/2)+1;
        count=1;
        while(count!=middle){
            temp=temp.next;
            count++;
        }
        return temp;
    }
}