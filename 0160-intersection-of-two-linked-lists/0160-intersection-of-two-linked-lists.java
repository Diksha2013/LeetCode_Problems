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
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        int length1 = 0;
        int length2 = 0;
        while(temp1 != null){
            temp1 = temp1.next;
            length1++;
        }
        while(temp2 != null){
            temp2 = temp2.next;
            length2++;
        }
        temp1 = headA;
        temp2 = headB;
        while(length1>length2){
            temp1 = temp1.next;
            length1--;
        }
        while(length2>length1){
            temp2 = temp2.next;
            length2--;
        }
        while(temp1!=null && temp2!=null){
            if(temp1 == temp2){
                return temp2;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return null;
    }
}