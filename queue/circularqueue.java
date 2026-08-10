public class circularqueue{
    public static class queue{
        int r =-1;
        int f=-1;
        int size=0;
        int[] arr = new int[10];
        int n = arr.length;
        public void add(int val) throws Exception {
            if(size==n){
                throw new Exception("queue is full");
            }
           else if(f==-1){
                r=f=0;
                arr[0]=val;
            }
           else if(r<n-1){
                arr[r+1] =val;
                r++;
            }
           else if(r==n-1){
                r=0;
                arr[0]=val;
            }
            size++;
        }
        public int remove() throws Exception {
            if(size==0){
                throw new Exception("queue is empty");
            }
            else{
                 int x = arr[f];
                 if(f==n-1){
                   f = 0;
                 }
                 else f++;
                 size--;
                 return x;
            }
        }
        public int peek()  throws Exception {
            if(size==0){
                throw new Exception("queue is empty");
            }
            else{
                return arr[f];
            } 
    }
    public boolean  isEmpty(){
       if(size==0) return true;
       return false;
    }
    public void display(){
        if(size==0){
            System.out.println("queue is empty");
            return;
        }
        else{
            if(f<=r){
                for(int i=f;i<=r;i++){
                    System.out.print(arr[i]+ " ");
                }
            }
            if(r<f){
                for(int i=f;i<=n-1;i++){
                    System.out.print(arr[i]+ " ");
                }
                for(int i=0;i<=r;i++){
                    System.out.print(arr[i]+ " ");
                }
            }
        }
        System.out.println();
       }
}
        public static void main(String[] args)  throws Exception {
            queue q = new queue();
            q.display();
            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);
            q.add(5);
            q.add(6);
            q.display();
            q.remove();
            q.display();
            System.out.println(q.peek());


        }
}