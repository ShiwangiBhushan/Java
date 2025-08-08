import java.uitl.*;

public class reversestring { 
    //reverse the string using stack
    public static String reverseString (String str) {
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while(idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder result = new StringBuilder("");
        while(!s.isEmpty()) {
            char curr = s.pop();
            result.append(curr);
        }
       return result.toString();
    }

    public static void main (String[] args) {
        //reverse string
        String str = "shiwangibhushan";
        String result = reverseString(str);
        System.out.println(result);

    }
    
}