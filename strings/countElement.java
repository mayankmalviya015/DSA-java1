import java.util.Scanner;
public class countElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n =sc.nextInt();
        String s = Integer.toString(n);
        System.out.println(s);
        System.out.println(s.length());
    }
}
