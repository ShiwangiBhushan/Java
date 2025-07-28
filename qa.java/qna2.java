public class linkedlist{
    // reverse the linked list . remember 4 rules
    public void reverse() { //O(n)
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public static void main(String[] args) {
        
    }
}

