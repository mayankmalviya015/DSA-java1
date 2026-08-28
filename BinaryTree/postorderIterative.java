import java.util.*;
class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val= val;
    }
}
public class postorderIterative {
    public static void preorder(Node root){
        Stack<Node> st = new Stack<>();
        Stack<Node> gt = new Stack<>();
        if(root!=null)st.push(root);
        while(st.size()>0){
            Node temp = st.pop();
            gt.push(temp);
            if(temp.left!=null)st.push(temp.left);
            if(temp.right!=null)st.push(temp.right);
        }
        while(gt.size()>0){
            System.out.print(gt.pop().val+ " ");
        }

    }
    public static void main(String[] args) {
       Node a = new Node(1);
       Node b = new Node(2);
       Node c = new Node(3);
       Node d = new Node(4);
       Node e = new Node(5);
       Node f = new Node(6);
       a.left =b ; a.right =c;
       b.left = d; b.right =e;
       c.left =f;
       preorder(a);
    }
}
