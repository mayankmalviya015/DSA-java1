import java.util.Scanner;
public class Sum {
    public static void sum(int n , int s){
        if(n==0){
            System.out.println(s);
            return;
        }
        sum(n-1 ,n+s);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number");
        int n = sc.nextInt();
        sum(n,0);
    }
}
