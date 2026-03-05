import java.util.Scanner;
public class Mazepath2 {
    public static int maze2(int m , int n){
        if(m==1 || n==1) return 1;
        int rightways = maze2(m,n-1);
        int downways = maze2(m-1,n);
        return rightways + downways;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter m :");
        int m = sc.nextInt();
        System.out.print("enter n :");
        int n= sc.nextInt();
        System.out.println(maze2(m,n));

    }
}
