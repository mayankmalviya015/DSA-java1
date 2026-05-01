import java.util.Stack;

public class reverse {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(50);
        st.push(6);
        st.push(70);
        st.push(10);
        st.push(90);
        st.push(100);
        System.out.println(st);
        // reverse 
        Stack<Integer> rt = new Stack<>();
        while(st.size()>0){
            int x = st.peek();
            rt.push(x);
            st.pop();
        }
        System.out.println(rt);
    }
}
