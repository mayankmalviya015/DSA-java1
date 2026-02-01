import java.util.*;
public class SortingStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("mayank");
        char[] ch= sb.toString().toCharArray();
        Arrays.sort(ch);
        for(char ele : ch){
            System.out.print(ele + " ");
        }
    }
}
