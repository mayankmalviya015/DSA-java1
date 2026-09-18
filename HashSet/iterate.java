import java.util.HashSet;

public class iterate {
    public static void main(String[] args) {
        //create
        HashSet<Integer> set = new HashSet<>();
        //add
        set.add(146);
        set.add(2);
        set.add(3344);
        set.add(4);
        set.add(5);
        set.add(4783);
        for (int ele : set) {
             System.out.print(ele+ " ");
        }
        set.clear(); 
        System.out.println("");
    System.out.println(set);
    }
}
