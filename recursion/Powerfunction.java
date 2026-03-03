import java.util.Scanner;
public class Powerfunction {
    public static int pow(int a , int b){
        if(b==1) return a;
        if(b==0) return 1;
        int ans = a*pow(a, b-1);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number :");
        int a =sc.nextInt();
        System.out.println("enter b number :");
        int b =sc.nextInt();
        System.out.println(pow(a,b));
    }
}
