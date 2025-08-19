public class swap {
    public static void main (String [] args) {
        int idx = 1 , idx2 = 2;
        System.out.print(list);
        swap(list ,idx1,idx2);
        System.out.print(list);

        //ascending order
        Collections.sort(list);
        //descending order
        Collections.sort(list, Collections.reverseOrder());

        //swap 2 numbers
    public static void swap (ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        
        list.set(idx2,temp);
    }

    
    }
    
}