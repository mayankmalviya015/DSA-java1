class Node {
    int value;
    Node next;
    Node(int value){
        this.value = value;
    }
}
public class shallowcopy {
    public static void print(Node head){
               Node temp =head;
        while(temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    public static void displayrecursive(Node head){
        if(head==null) return;
        System.out.println(head.value);
        displayrecursive(head.next);
    }
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
        displayrecursive(a);
    }
}
