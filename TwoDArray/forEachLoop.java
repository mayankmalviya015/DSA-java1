import java.util.Scanner;

public class forEachLoop {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];
        Scanner sc = new Scanner(System.in);

        // input
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        //  output (for-each)
        for(int[] row : arr){
            for(int x : row){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
