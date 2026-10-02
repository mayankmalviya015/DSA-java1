class Node {
   int val;
   Node left;
   Node right;

   Node(int var1) {
      this.val = var1;
   }
}

public class min {
    public static void main(String[] args) {
      Node a = new Node(10);
       Node b = new Node(5);
       Node c = new Node(15);
       Node d = new Node(2);
       Node e = new Node(8);
       Node f = new Node(12);
       Node g = new Node(19);
      a.left =b ; a.right =c;
       b.left = d; b.right =e;
       c.left =f; c.right =g;
       System.out.println(findMax(a));
      System.out.println(findMin(a));

    }
      public static int findMin(Node root) {
        if (root == null) return -1;

        while (root.left != null) {
            root = root.left;
        }

        return root.val;
    }

     public static int findMax(Node root) {
        if (root == null) return -1;

        while (root.right != null) {
            root = root.right;
        }

        return root.val;
    }

}
