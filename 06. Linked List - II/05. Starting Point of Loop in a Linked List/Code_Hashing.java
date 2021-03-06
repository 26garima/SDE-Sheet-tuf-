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
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null)
            return null;
        
        HashSet<ListNode> set = new HashSet<>();
        ListNode temp = head;
        while(temp != null) {
            if(!set.contains(temp)) {
                set.add(temp);
                temp = temp.next;
            } else {
                return temp;
            }
        }
        return null;
    }
}

// Time Complexity : O(n)
// Space Complexity : O(n)
