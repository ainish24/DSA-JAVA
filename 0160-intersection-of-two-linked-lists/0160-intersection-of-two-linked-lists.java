/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null) return null;
        ListNode tempA=headA, tempB=headB;
        int count1=0,count2=0;
        while(tempA!=null){
            count1++;
            tempA=tempA.next;
        }
        while(tempB!=null){
            count2++;
            tempB=tempB.next;
        }
        tempA=headA;
        tempB=headB;
        if(count1>count2){
            for(int i=1;i<=count1-count2;i++) tempA=tempA.next;
        }else{
            for(int i=1;i<=count2-count1;i++) tempB=tempB.next;

        }
        while(tempA!=tempB && tempA!=null){
            tempA=tempA.next;
            tempB=tempB.next;
        }
        return tempA;
    }
}