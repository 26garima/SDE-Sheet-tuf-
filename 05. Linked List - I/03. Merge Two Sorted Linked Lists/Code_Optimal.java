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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null || list2 == null) {
            if(list1 == null)
                return list2;
            return list1;
        }
        
        ListNode newHead, t;
        if(list1.val <= list2.val) {
            newHead = list1;
            list1 = list1.next;
        } else {
            newHead = list2;
            list2 = list2.next;
        }
        t = newHead;
        
        while(list1 != null && list2 != null) {
            if(list1.val <= list2.val) {
                t.next = list1;
                list1 = list1.next;
            } else {
                t.next = list2;
                list2 = list2.next;
            }
            t = t.next;
        }
        
        if(list1 != null)
            t.next = list1;
        
        if(list2 != null)
            t.next = list2;
        
        return newHead;
    }
}

// Time Complexity : O(m + n)
// Space Complexity : O(1) 
