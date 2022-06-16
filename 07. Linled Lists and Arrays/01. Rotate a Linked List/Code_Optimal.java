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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0)
            return head;
        
        int n = 0;
        ListNode temp = head;
        while(temp.next != null) {
            n++;
            temp = temp.next;
        }
        n++;
        temp.next = head;
        k %= n;
        k = n - k;
        temp = head;
        
        while(k != 1) {
            temp = temp.next;
            k--;
        }
        head = temp.next;
        temp.next = null;
        return head;
    }
}

// Time Complexity : O(n)
// Space Complexity : O(1)
