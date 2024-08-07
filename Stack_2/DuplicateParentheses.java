import java.util.*;

public class DuplicateParentheses{
    public static boolean isDuplicated(String str){
        Stack<Character>s = new Stack<>();

        for(int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);

            // closing
            if(ch == ')'){
                int count = 0;
                while(s.peek() != '('){
                    s.pop();
                    count++;
                } 
                if(count < 1){
                    return true;   // duplicate exists
                }
                else{
                    s.pop();
                }
            }

            // opening or operator or operands
            else{
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String args[]){
        String str = "((a+b))";
        String str2 = "(a-b)";
        System.out.println(isDuplicated(str));
        System.out.println(isDuplicated(str2));
    }
}