// problem: print the "hello world" 1 to "n"......
import java.util.Scanner;

public class helloworld {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Hello World");
        }

        
    }
}
