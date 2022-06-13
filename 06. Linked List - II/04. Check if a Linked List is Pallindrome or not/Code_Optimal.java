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
    public boolean isPalindrome(ListNode head) {
        if(head.next == null)
            return true;
        
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode prev = null;
        ListNode nex = null;
        ListNode curr = slow.next;
        while(curr != null) {
            nex = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nex;
        }
        slow.next = prev;
        slow = slow.next;
        
        ListNode dummy = head;
        while(slow != null) {
            if(dummy.val != slow.val)
                return false;
            slow = slow.next;
            dummy = dummy.next;
        }
        return true;
    }
}

// Time Complexity : O(n)
// Space Complexity : O(1)
