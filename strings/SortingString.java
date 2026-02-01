import java.util.*;
public class SortingString {
    public static void main(String[] args) {
        String s ="mayank";
        System.out.println(s);
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        for(char ele : ch){
            System.out.print(ele+ " ");
        }
    }
}
