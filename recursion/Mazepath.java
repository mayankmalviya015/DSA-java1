import java.util.Scanner;
public class Mazepath {
    public static int maze(int row,int col , int m ,int n){
        if(row ==m && col==n) return 1;
        if(m<row || n<col) return 0;
        int rightways =maze(row,col+1 , m, n);
        int downways =maze(row+1,col,m,n);
        return rightways + downways;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter m : ");
        int m=sc.nextInt();
        System.out.println("enter n :");
        int n =sc.nextInt();
        System.out.print(maze(1,1,m,n));
    }
}
