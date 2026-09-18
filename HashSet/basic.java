import java.util.HashSet;

public class basic {
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
        //search in o(1)
       System.out.println(set.contains(4));
       //size in o(1)
        System.out.println(set.size());
        // remove in o(1)
        set.remove(4);
        //print
        System.out.print(set);

       }
}
