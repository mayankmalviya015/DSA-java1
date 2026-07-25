    
import java.util.*;

public class insertAnyIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        st.push(8);
        st.push(9);
        System.out.println("enter a index");
        int n = sc.nextInt();
        Stack<Integer> rt = new Stack<>();
        while(st.size()>=n){
            rt.push(st.pop());
        }
        System.out.println("enter a number");
        int x = sc.nextInt();
        st.push(x);
        while(rt.size()>0){
            st.push(rt.pop());
        }
        System.out.println(st);
    }
}


