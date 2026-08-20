class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val= val;
    }
}
public class FindSum {
    public static void main(String[] args) {
       Node a = new Node(1);
       Node b = new Node(2);
       Node c = new Node(3);
       Node d = new Node(10);
       Node e = new Node(5);
       Node f = new Node(6);
       a.left =b ; a.right =c;
       b.left = d; b.right =e;
       c.left =f;
       display(a);
       
        System.out.print(sum(a));
       
    }
    private static int sum(Node root){
        if(root==null) return 0;
        int x = root.val;
        return x + sum(root.left) + sum(root.right);
    }
    private static void display(Node root){
        if(root==null) return;
        System.out.print(root.val + " ");
        display(root.left);
        display(root.right);
      
    }
}