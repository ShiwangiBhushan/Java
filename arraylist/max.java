import java.util.*;

public class arraylist {
    /* array => fix size and stores primitive datatypes
    arraylist => dynamic size & no storage of primitives
     */
    public static void main(String[] args) {
        // Classname objectName = new ClassName();
        ArrayList<Integer> list6 = new ArrayList<>();
        /* operations
        add , get(to get the index of) , remove ,
        set element at index , contains element
         */

        ArrayList <Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        


        // to return the max element

        int MAX = Integer.MIN_VALUE;
        for (int i =0; i<list.size(); i++) {
            if(MAX < list.get(i)) {
                MAX = list.get(i);
            }
        }
        //System.out.println("max element = " + max);

        
    }
}
