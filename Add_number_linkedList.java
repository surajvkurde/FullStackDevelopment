/*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

eg:
Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
*/

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode tmp,tmp1=null,head2=null;
        int rem=0;
        int res;
        
        while(l1!=null && l2!=null)
        {
            res=l1.val+l2.val+rem;
            rem=res/10;
            tmp=new ListNode(res%10);
            l1=l1.next;
            l2=l2.next;
            if(tmp1==null)
            {
                tmp1=tmp;
                head2=tmp;
            }
            else
            {
                tmp1.next=tmp;
                tmp1=tmp1.next;
            }            
        }
        
        while(l1!=null)
        {
            res=l1.val+rem;
            rem=res/10;
            tmp=new ListNode(res%10);
            l1=l1.next;
            tmp1.next=tmp;
            tmp1=tmp1.next;
        }
        while(l2!=null)
        {
            res=l2.val+rem;
            rem=res/10;
            tmp=new ListNode(res%10);
            l2=l2.next;
            tmp1.next=tmp;
            tmp1=tmp1.next;
        }
        if(rem>0)
        {
            tmp=new ListNode(rem);
            tmp1.next=tmp;
        }
        
        return head2;
        
    }
}
