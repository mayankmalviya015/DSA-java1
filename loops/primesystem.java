
import java.util.Scanner;

public class primesystem {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number");
    int n = sc.nextInt();
    int x=0;
    for(int i= 2 ; i <= n-1 ; i++){
        if(n%i==0){
            System.out.println("number is composite");
            x = 1;
            break;
        }}
        if(n== 1) System.out.println("neither prime nor composite");
        else if(x==0) System.out.println("number is prime");
    
 }   
}
