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
        HashSet<ListNode> set = new HashSet<>();
        ListNode t1 = headA;
        ListNode t2 = headB;
        
        while(t1 != null) {
            set.add(t1);
            t1 = t1.next;
        }
        
        while(t2 != null) {
            if(set.contains(t2))
                return t2;
            set.add(t2);
            t2 = t2.next;
        }
        return null;
    }
}

// Time Complexity : O(m + n)
// Space Complexiy : O(max(m, n))
