import java.util.*;
class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val= val;
    }
}
public class Inorderiterative {
    public static void Inorder(Node root){
        Stack<Node> st = new Stack<>();
        Node temp = root;
        while(true){
            if(temp!=null){
                st.push(temp);
                temp =temp.left;
            }
            else{
                if(st.size()==0) break;
                Node top = st.pop();
                System.out.print(top.val+ " ");
                temp =top.right;
            }
           
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
       Inorder(a);
    }
}
