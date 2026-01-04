import java.util.Scanner;

public class ap3 {
    public static void main(String[] args) {
       // problem : display this airthmatic progession - 5 , 1 , -3 , -7 , -15 ............. upto 'n' number of term  
        Scanner sc = new Scanner(System.in);
    System.out.println("enter n :");
    int n = sc.nextInt();
    int a = 5, d =-4 ;
    for(int i=1; i<=n ; i++){
        System.out.println(a);
        a+=d;
    }
    }  
}
