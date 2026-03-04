import java.util.Scanner;
public class powerfunctionInLogn {
    public static int pow(int a, int b){
        if(b==0) return 1;
        int ans = pow(a,b/2);
        if(b%2==0) return ans*ans;
        else return b*ans*ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a : ");
        int  a= sc.nextInt();
        System.out.print("enter b :");
        int  b= sc.nextInt();
        System.out.println(pow(a,b));
    }
}
