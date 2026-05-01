import java.util.Scanner;
import java.util.Stack;
public class inputOfStack {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        System.out.println("enter you stack size");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println(st);
    }
}
