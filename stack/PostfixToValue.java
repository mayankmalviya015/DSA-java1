import java.util.Stack;

public class PostfixToValue {
    public static void main(String[] args) {
         String str ="96*53/8-+";
        Stack<Integer> val = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int)ch;
            // '0'=> and '9' =>57 
            if(ascii>=48 && ascii<=59){
                val.push(ascii-48);
            }
            else{
                int v2 = val.pop();
                int v1 = val.pop();
                if(ch=='+') val.push(v1+v2);
                if(ch=='-') val.push(v1-v2);
                if(ch=='*') val.push(v1*v2);
                if(ch=='/') val.push(v1/v2);
    }
}
System.out.println(val.peek());

}
}