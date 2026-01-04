import java.util.Scanner;

public class ap1_simple {
    public static void main(String[] args) {
        // problem : display this airthmatic progession - 1 , 3 , 5 , 7 , 9 ..... upto 'n' number of term 
        Scanner sc = new Scanner(System.in);
    System.out.println("enter n :");
    int n = sc.nextInt();
    int a = 1, d =2;
    for(int i=1; i<=n ; i++){
        System.out.println(a);
        a+=d;
    }
    }  
}
