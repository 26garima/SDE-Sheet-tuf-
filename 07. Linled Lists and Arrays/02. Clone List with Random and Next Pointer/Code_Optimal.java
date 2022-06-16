/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null)
            return null;
        Node copy = null;
        Node temp = head;
        
        // make copy node
        while(temp != null) {
            copy = new Node(temp.val);
            copy.next = temp.next;
            temp.next = copy;
            temp = temp.next.next;
        }
        
        // set random pointer of copy nodes
        temp = head;
        while(temp != null) {
            if(temp.random == null)
                temp.next.random = temp.random;
            else
                temp.next.random = temp.random.next;
            temp = temp.next.next;
        }
        
        temp = head;
        Node newHead = temp.next;
        Node temp2 = newHead;
        
        // seperate copy nodes from original nodes
        while(temp != null) {
            temp.next = temp.next.next;
            if(temp.next != null)
                temp2.next = temp2.next.next;
            temp = temp.next;
            temp2 = temp2.next;
        }
        return newHead;
    }
}

// Time Complexity : O(n)
// Space Complexity : O(1)
