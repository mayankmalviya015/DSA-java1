class maxHeap{
private  int[] arr;
private  int size;
maxHeap(int capacity) {
        arr = new int[capacity];
        size=0;
    }
//add
     public void add(int n){
        arr[size++] =n;
        upheapify(size-1);
    }
    public void upheapify(int idx){
        if(idx==0) return;
        int parent = (idx - 1) / 2;
        if(arr[idx]>arr[parent]){
        swap(parent,idx);
        upheapify(parent);
        }
    }
    public void swap(int i ,int j){
        int temp = arr[i];
        arr[i] =arr[j];
        arr[j] =temp;
    }
        //size
    public int size(){
        return size;
    }
    // peek
    public int peek() throws Exception{
        if(size==0){
            throw new Exception("heap is empty");
        }
        return arr[0];
   }
//   remove
    public int remove() throws Exception{
        if(size==0){
            throw new Exception("heap is empty");
        }
        int peek =arr[0];
        swap(0,size-1);
        size--;
        downHeapify(0);
        return peek;
    }
    public void downHeapify(int idx){
        if(idx>=size) return;
        int lc = 2*idx +1;
        int rc = 2*idx +2;
        int minidx =idx;
        
        if(lc<size && arr[lc] >arr[minidx]) minidx =lc;
        if(rc<size && arr[rc] > arr[minidx]) minidx =rc;
        if(idx==minidx) return;
        swap(idx, minidx);
        downHeapify(minidx);

    }
}


public class maxHeapImplementionByArray {
    public static void main(String[] args) throws Exception {
        maxHeap pq = new maxHeap(20);
        pq.add(1);
        pq.add(5);
        pq.add(7);
        System.out.println(pq.peek());
        System.out.println(pq.size());
        pq.remove();
         System.out.println(pq.peek());
        System.out.println(pq.size());
    }
}
