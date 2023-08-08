class Solution {
    // Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head) {
        if (head == null || head.next == null) {
            return false; // No loop in an empty list or a list with a single node
        }
        
        Node slow = head;
        Node fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;         // Move slow pointer by one step
            fast = fast.next.next;    // Move fast pointer by two steps
            
            if (slow == fast) {
                return true; // Loop detected
            }
        }
        
        return false; // No loop detected
    }
}

