public class TurtleHare {
    public static class Node {
        int data;
        Node next;

        public Node (int data){
            this.data = data;
            this.next = null;
        }

    }
    public static Node head;
    public static Node tail;

    /*check for palindrome
    1) turtle hare pointers
    2) find mid
    3) reverse
    4) check equality
    */

    //Step -1)finding mid
    public Node findMid(Node head) {
        //initialise both the pointers with the head
        Node slow = head;
        Node fast = head;

        while (fast!= null && fast.next!= null) {
            slow  = slow.next; // moves 1 ahead
            fast = fast.next.next; // twice ahead
        }
        return slow; // slow is my midnode
    }
    public boolean checkPalindrome() {
        //base case
        if(head == null || head.next == null) {
            return true;
        }
        //step1)
        Node midNode = findMid(head);
        //step2) - reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr!= null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;//right half head
        Node left = head;
        //step3)- check left & ryt half
        while(right != null){
            if(left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
        }

    public static void main(String[] args) {

    }
}