import java.util.*;

/*Q -> push the number at the bottom of the stack,because in
stack the no. are pushed at the top  LIFO
*/

public class stackQ {
    public static void pushatbottm(Stack<Integer> s, int data) {
        if(s.isEmpty()) {
           s.push(data);
           return;
        }
        //solveed using recursion
        int top = s.pop();
        pushatbottm(s, data);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        //pushatbottm(s, 4);
        while(!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}