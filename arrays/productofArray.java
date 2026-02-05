// problem : calculate the product of all the elements in the array?
import java.util.Scanner;
public class productofArray{
public static void main(String[] args) {
    System.out.println("enter a size of array");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("enter the elements of array");
    int product = 1;
    for (int i = 0; i< n; i++) {
        arr[i]= sc.nextInt();
        product *= arr[i];
    } 
     System.out.println(product);
}

}