import java.util.Scanner;
public class AddTwoMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        int[][] brr = new int[3][3];
        int[][] krr = new int[3][3];
        int i,j;
        System.out.println("enter element of arr");
          for ( i = 0; i < 3; i++) {
            for ( j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter element of brr");
    for ( i = 0; i < 3; i++) {
            for ( j = 0; j < 3; j++) {
                brr[i][j] = sc.nextInt();
            }
        }
        for ( i = 0; i < 3; i++) {
            for ( j = 0; j < 3; j++) {
                krr[i][j] =arr[i][j] + brr[i][j];
            }
        }
         for ( i = 0; i < 3; i++) {
            for ( j = 0; j < 3; j++) {
                System.out.print(krr[i][j]+ "   ");
            }
            System.out.println();
        }
        

    }
}
