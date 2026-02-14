import java.util.Scanner;
public class StoreStudentImformation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] students = new int [4][2];
        for (int i = 0; i < 4; i++) {
            for(int j = 0 ; j <2 ; j++){
                students[i][j] = sc.nextInt();
            }
            }
            for(int ele[] : students){
                for(int x : ele){
                    System.out.print(x + " ");
                }
                System.out.println();
                
                
            }
        }
    }

