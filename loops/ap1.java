import java.util.Scanner;
public class ap1 {
public static void main(String[] args) {
    // display this airthmatic progession - 1 , 3 , 5 , 7 , 9 ..... upto 'n' number of term 
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=1; i<= n*2-1 ; i +=2){
        System.out.println(i);
    }
    sc.close();
}
}
