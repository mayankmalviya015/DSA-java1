import java.util.Scanner;
public class SumAllElement{
    public static void main(String[] args) {
        int[][] arr = new int[2][4];
        int mx = Integer.MIN_VALUE;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 4; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
            for(int i = 0; i<2; i++){
                for(int j =0 ; j<4 ; j++){
                    sum= sum + arr[i][j];
                    }
                }
              System.out.println(sum);
                }
            }
