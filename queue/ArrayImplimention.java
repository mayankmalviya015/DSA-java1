public class ArrayImplimention {
    public static class queueA{
        int[] arr = new int[10];
        int f = -1;
        int r = -1;
        int size=0;
        public void add(int x){
            if(size==arr.length-1){
                System.out.println("queue is full");
            }
            if(f==-1){
                f=r=0;
                arr[0] =x;
            }
            else{
                arr[r+1] =x;
                r++;
            }
            size++;
        }

        public int remove(){
            if(size==0){
                 System.out.println("queue is empty");
                return -1;
            }
            f++;
            size--;
            return arr[f-1];
        }
        public int peek(){
            if(size==0){
                 System.out.println("queue is empty");
                return -1;
            }
            return arr[f];
        }
        public int size(){
            return size;
        }
        public void display(){
             if(size==0){
                 System.out.println("queue is empty");
            }
            for(int i=f;i<=r;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }


    }
    public static void main(String[] args) {
        queueA q = new queueA();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.display();
        q.remove();
        q.display();


    }
}
