
import java.util.*;
public class list {
    public static void main(String[] args) {
        List<List<Integer>> li = new ArrayList<>();
        List<Integer> a = new ArrayList<>();
        a.add(5);
        a.add(10);
        a.add(20);
        List<Integer> b = new ArrayList<>();
        b.add(5);
        b.add(10);
        List<Integer> c = new ArrayList<>();
         List<Integer> d = new ArrayList<>();
    d.add(2);
    d.add(4);
    li.add(a);
    li.add(b);
li.add(c);
li.add(d);
        for(int i =0 ;i<= li.size(); i++ ){
            System.out.println(li.get(i)+ " ");
        }
    }
}
