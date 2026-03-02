import java.util.Scanner;
public class SumreturnType {
    public static int sum(int n){
        if(n==1 || n==0) return n;
        return n +sum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number :");
        int n = sc.nextInt();
        System.out.println(sum(n));
    }
}
