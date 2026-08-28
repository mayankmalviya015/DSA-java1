
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val= val;
    }
}
public class BSF {
    static  int n;


    private static void display(Node root){
        if(root==null) return;
        System.out.print(root.val + " ");
        display(root.left);
        display(root.right);

    }




   private static void nTHLEVEL(Node root ,int level){
        if(root==null) return;
       if(level==n) System.out.print(root.val + " ");
        nTHLEVEL(root.left,level+1);
        nTHLEVEL(root.right ,level+1);

    }





   public static void levelOrder(Node root){
     Queue<Node> q = new LinkedList<>();
     if(root !=null) q.add(root);
     while(q.size()>0){
        Node front = q.remove();
        System.out.print(front.val + " ");
        if(front.left!=null)q.add(front.left);
        if(front.right!=null)q.add(front.right);

     }
   }




   public static void rightToleft(Node root){
     Queue<Node> q = new LinkedList<>();
     if(root !=null) q.add(root);
     while(q.size()>0){
        Node front = q.remove();
        System.out.print(front.val + " ");
         if(front.right!=null)q.add(front.right);
        if(front.left!=null)q.add(front.left);
       

     }
   }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       Node a = new Node(1);
       Node b = new Node(2);
       Node c = new Node(3);
       Node d = new Node(4);
       Node e = new Node(5);
       Node f = new Node(6);
       Node g = new Node(7);
       a.left =b ; a.right =c;
       b.left = d; b.right =e;
       c.left =f; c.right =g;
       Queue<Node> q = new LinkedList<>();
       System.out.print("preorder : -> ");
        display(a);
        System.out.println();
        System.out.print("BSF left to right : -> ");
        levelOrder(a);
         System.out.println();
        System.out.print("BSF right to left : -> ");
        rightToleft(a);
        System.out.println();
        System.out.println("its our tree");
        // System.out.println("enter n");
        // n = sc.nextInt();
        // nTHLEVEL(a,0);
        // level wise printing using DFS
        for(int x=0;x<3;x++){
            n=x;
            nTHLEVEL(a,0);
            System.out.println();
        }
    }
}
