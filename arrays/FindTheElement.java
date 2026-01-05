// problem : find the element 'x' in the array . take array and 'x' as input
import java.util.Scanner;
public class FindTheElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = 0;
        System.out.println("enter a target element");
        int x = sc.nextInt();
        System.out.println("enter a size");
        int n =sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter a array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();   
        }
        for (int i = 0; i < n; i++) {
             if(arr[i]==x){
            System.out.println("element found");
            y= 1;
            break;}
        }
            if(y==0)System.out.println("element not found");
        }
    }

