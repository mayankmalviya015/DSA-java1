
public class LinkedListImplimentation {
    public static  class Node{
        int val;
        Node next;
        Node(int val) {
        this.val = val;
    }
    }
    public static class LLStack{
        private Node head =null;
        private int size =0;
        void push(int x){
            Node temp = new Node(x);
            temp.next =head;
            head = temp;
            size++;
        }
        int pop(){
            if(head==null){
                System.out.println("stadck is empty");
                return Integer.MIN_VALUE;
            }
            int top = head.val;
            head = head.next;
            size--;
            return top;
        }
        int peek(){
            if(head==null){
                System.out.println("stadck is empty");
                return Integer.MIN_VALUE;
            }
            return head.val;
        }
        void displayreverse(){
            Node temp = head;
            while(temp !=null){
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }
        void displayrec(Node h){
            if(h==null) return;
            displayrec(h.next);
            System.out.print(h.val + " ");

        }
        void display(){
            displayrec(head);
            System.out.println();
        }
        int size(){
            return size;
        }
    }
    public static void main(String[] args) {
        LLStack st = new LLStack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.size();
        st.display();
        System.out.println(st.peek());
        st.pop();
         st.display();
        System.out.println(st.peek());
        st.display();
    }
}
