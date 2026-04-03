class Node {
    int value;
    Node next;
    Node(int value){
        this.value = value;
    }
}
// basic of linked list........................

public class Linked_List{
    
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);
        Node g = new Node(70);
        a.next =b;  //a-> b
        b.next =c; //a-> b -> c
        c.next =d; //a-> b -> c -> d
        d.next =e; //a-> b -> c -> d -> e
        e.next =f; //a-> b -> c -> d -> e -> f
        f.next =g; //a-> b -> c -> d -> e ->f -> g
        System.out.println(a.value);
        System.out.println(a.next.value);
        System.out.println(a.next.next.value);
        System.out.println(a.next.next.next.value);
        System.out.println(a.next.next.next.next.value);
        System.out.println(a.next.next.next.next.next.value);
        System.out.println(a.next.next.next.next.next.next.value);
        System.out.println(a.next.next.next.next.next.next.next.value);
     }
}
