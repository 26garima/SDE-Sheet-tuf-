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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null)
            return null;
        ListNode fast = head;
        ListNode slow = head;
        int m = n;
        if(n == 1) {
            fast = fast.next;
        } else {
            while(n > 1) {
                fast = fast.next;
                n--;
            }
        }
        
        while(fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        
        if(m == 1) {
            slow.next = null;
        } else {
            slow.val = slow.next.val;
            slow.next = slow.next.next;
        }
        return head;
    }
}

// Time Complexity : O(n)
// Space Complexity : O(1)
