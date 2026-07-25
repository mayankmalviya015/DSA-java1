
public class implimentationArray {
    public static class Stack{
       private  int[] arr = new int[10];
       private  int idx =0;
        void push(int x){
            if(isFull()){
                System.out.println("stack is full");
                return;
            }
            arr[idx] =x;
            idx++;
        }
        int pop(){
             if(idx==0){
                System.err.println("underflow error");
                return Integer.MIN_VALUE;
            }
            int top = arr[idx-1];
            arr[idx-1]=0;
            idx--;
            return top;
        }
        int peek(){
            if(idx==0){
                System.err.println("underflow error");
                return Integer.MIN_VALUE;
            }
            return arr[idx -1];
        }
        void size(){
            System.err.println(idx + " size");
        }
        void display(){
            for(int i=0;i<idx-1;i++){
                System.err.print(arr[i] + " ");
            }
        }
        boolean isEmpty(){
            if(idx==0) return true;
            else return false;
        }
        boolean isFull(){
            if(idx==arr.length) return true;
            else return false;
        }

    }
    public static void main(String[] args) {
        Stack st = new Stack();
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
        st.peek();
        System.out.println(st.peek());
        st.display();
    }
}
