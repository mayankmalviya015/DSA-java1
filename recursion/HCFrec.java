import java.util.Scanner;
public class HCFrec {
    public static int gcd(int a , int b){
        if(b%a==0) return a;
        return gcd(b%a,a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a  :");
        int a = sc.nextInt();
        System.out.print("enter b  : ");
        int b = sc.nextInt();
        System.out.println(gcd(a,b));
    }
}
