public  class linkedlist {
    // iterative search
    public int itrSearch(int key) { // O(n)
        Node temp = head;
        int i = 0;

        while(temp != null) {
            //mil gyi key.. yeah!!!!!!!
            if(temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }

        // key not found
        return -1;
    }
    //recursive search
    public int helper(Node head,int key) {
        if(head == null) {
            return -1;
        }

        if(head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }

        return idx+1;

    }
    public static void main(String[] args) {
        
    }
}