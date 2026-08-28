class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val= val;
    }
}
public class size {
     public static void main(String[] args) {
       Node a = new Node(1);
       Node b = new Node(2);
       Node c = new Node(3);
       Node d = new Node(47);
       Node e = new Node(5);
       Node f = new Node(6);
       Node g = new Node(68);
       a.left =b ; a.right =c;
       b.left = d; b.right =e;
       c.left =f; c.right =g;
       display(a);
       System.out.println();
       
        System.out.print(size(a));
       
    }
    private static int size(Node root){
        if(root==null) return 0;
        return size(root.left) + size(root.right) +1;
        
        
    }
    private static void display(Node root){
        if(root==null) return;
        System.out.print(root.val + " ");
        display(root.left);
        display(root.right);
    }
}
