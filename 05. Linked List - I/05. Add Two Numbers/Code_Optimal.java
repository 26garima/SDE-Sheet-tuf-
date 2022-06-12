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
        int carry = 0;
        ListNode head = new ListNode();
        ListNode p = head;
        ListNode temp;

        while(l1 != null && l2 != null) {
            temp = new ListNode();
            temp.val = (l1.val + l2.val + carry) % 10;
            carry = (l1.val + l2.val + carry) / 10;
            p.next = temp;
            p = p.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        
        while(l1 != null) {
            temp = new ListNode();
            temp.val = (l1.val + carry) % 10;
            carry = (l1.val + carry) / 10;
            p.next = temp;
            p = p.next;
            l1 = l1.next;
        }
        
        while(l2 != null) {
            temp = new ListNode();
            temp.val = (l2.val + carry) % 10;
            carry = (l2.val + carry) / 10;
            p.next = temp;
            p = p.next;
            l2 = l2.next;
        }
        
        if(carry == 1) {
            temp = new ListNode(carry);
            p.next = temp;
        }
        
        return head.next;
    }
}

// Time Complexity : O(max(m, n))
// Space Complexity : O(max(m, n))
