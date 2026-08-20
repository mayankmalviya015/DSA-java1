class Node {
   int val;
   Node left;
   Node right;

   Node(int var1) {
      this.val = var1;
   }
}
public class FindMax {
     public static void main(String[] args) {
       Node a = new Node(1);
       Node b = new Node(2);
       Node c = new Node(3);
       Node d = new Node(47);
       Node e = new Node(5);
       Node f = new Node(6);
       a.left =b ; a.right =c;
       b.left = d; b.right =e;
       c.left =f;
       display(a);
       System.out.println();
       
        System.out.print(max(a));
       
    }
    private static int max(Node root){
        if(root==null) return Integer.MIN_VALUE;
        return Math.max(root.val ,Math.max(max(root.left), max(root.right)));
        
    }
    private static void display(Node root){
        if(root==null) return;
        System.out.print(root.val + " ");
        display(root.left);
        display(root.right);
    }
}
