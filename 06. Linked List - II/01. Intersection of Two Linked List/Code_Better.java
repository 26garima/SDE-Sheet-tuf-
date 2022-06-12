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
        int len1 = 0;
        int len2 = 0;
        ListNode d1 = headA;
        ListNode d2 = headB;
        
        while(d1 != null || d2 != null) {
            if(d1 != null) {
                len1++;
                d1 = d1.next;
            }
            if(d2 != null) {
                len2++;
                d2 = d2.next;
            }
        }
        
        d1 = headA;
        d2 = headB;
        int diff = Math.abs(len1 - len2);
        
        if(len1 < len2) {
            while(diff != 0) {
                d2 = d2.next;
                diff--;
            }
        } else {
            while(diff != 0) {
                d1 = d1.next;
                diff--;
            }
        }
        
        while(d2 != null) {
            if(d1 == d2)
                return d1;
            d1 = d1.next;
            d2 = d2.next;
        }
        return null;
    }
}

// Time Complexity : O(max(m, n))
// Space Complexity : O(1)
