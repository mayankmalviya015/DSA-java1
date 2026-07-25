import java.util.Stack;

public class reverse {
    public static void insertAtBottom(Stack<Integer> st ,int x){
        Stack<Integer> rt = new Stack<>();
        while(st.size()>0){
            rt.push(st.pop());
        }
        st.push(x);
        while(rt.size()>0){
            st.push(rt.pop());
        }
    }
    public static void reverse(Stack<Integer> st){
        if(st.size() ==1) return;
        int top = st.pop();
        reverse(st);
        insertAtBottom(st,top);


    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(50);
        st.push(6);
        st.push(70);
        st.push(10);
        st.push(90);
        st.push(100);
        System.out.println(st);
        reverse(st);
        System.out.println(st);

        // reverse 
        // Stack<Integer> rt = new Stack<>();
        // while(st.size()>0){
        //     int x = st.peek();
        //     rt.push(x);
        //     st.pop();
        // }
        // System.out.println(rt);
        //  Stack<Integer> pt = new Stack<>();
        // while(rt.size()>0){
        //     int x = rt.peek();
        //     pt.push(x);
        //     rt.pop();
        // }
        // System.out.println(pt);
        // while(pt.size()>0){
        //     int x = pt.peek();
        //     st.push(x);
        //     pt.pop();
        // }
        // System.out.println(st);
    }
}
