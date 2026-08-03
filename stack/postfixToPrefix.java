import java.util.*;
public class postfixToPrefix {
    public static void main(String[] args) {
        String str ="953+4*6/-";
        Stack<String> val = new Stack<>();
        for (int i = 0 ; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int)ch;
            // '0'=> and '9' =>57 
            if(ascii>=48 && ascii<=59){
                String c = "" + ch;
                val.push(c);
            }
            else{
            String v2 = val.pop();
            String v1 = val.pop();
            String t = ch+ v1 +v2;
            val.push(t);
            }
    }
    System.out.println(val.peek());
    }
}
