import java.util.Scanner;

public class ap2_simple {
    public static void main(String[] args) {
       // problem : display this airthmatic progession - 4 , 7 , 10 , 13 , 16 ..... upto 'n' number of term  
        Scanner sc = new Scanner(System.in);
    System.out.println("enter n :");
    int n = sc.nextInt();
    int a = 4, d =3 ;
    for(int i=1; i<=n ; i++){
        System.out.println(a);
        a+=d;
    }
    }  
}
