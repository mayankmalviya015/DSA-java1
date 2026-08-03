 import  java.util.*;
public class infixToPostfix {
 public static void main(String[] args) {
    
        String str ="9*6+5/3-8";

        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int)ch;
            // '0'=> and '9' =>57 
            if(ascii>=48 && ascii<=59){
                String c = "" + ch;
                val.push(c);
            }
            else if(op.size()==0 || ch=='(' || op.peek()=='('){
                op.push(ch);
            }
            else if(ch==')'){
                while(op.peek()!='('){
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o =  op.pop();
                    String t = v1 +v2+o;
                    val.push(t);
                }
                op.pop();
            }
            else{
                if(ch=='+' || ch=='-'){
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o =  op.pop();
                     String t = v1 +v2+o;
                     val.push(t);
                    op.push(ch);
                }
                if(ch=='*' || ch=='/'){
                    if(op.peek()=='*' || op.peek()=='/'){
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o =  op.pop();
                    String t = v1 +v2+o;
                    val.push(t);
                    op.push(ch);
                    }
                    else op.push(ch);
                }

            }
        }
        while(val.size()>1){
            String v2 = val.pop();
            String v1 = val.pop();
            char o =  op.pop();
             String t = v1 +v2+o;
            val.push(t);
        }
        String prefix = val.peek();
        System.out.println(prefix);
    }
}
