import java.util.Scanner;
public class basicofarray {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the size of array");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("enter a elements");
    
    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }
    for (int i = 0; i < n; i++) {
        System.out.print(arr[i]+ "");
    }


}
}