
import java.util.Scanner;

public class FrequencyArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] freq = new int[26];
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            int idx =(int)ch-97;
            freq[idx]++;
        }
        int max =-1;
        for(int i = 0; i<freq.length; i++){
            max = Math.max(max ,freq[i]);     
        }
        for(int i =0;i<freq.length; i++){
            if(max==freq[i]){
                char ch = (char)(i +97);
                
                System.out.println(ch);
            }
        }
    }
}