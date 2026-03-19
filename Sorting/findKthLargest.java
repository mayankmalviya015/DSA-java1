public class findKthLargest {
    static int ans;
    public static void print(int[]arr){
        for(int ele :arr){
            System.out.print(ele +" ");
        }   
        System.out.println();     
    }
    public static void swap(int[] arr, int lo,int hi){
        int term = arr[lo];
        arr[lo] =arr[hi];
        arr[hi] =term;
    }
    public static int partition(int[] arr,int lo,int hi){
        int n = arr.length;
        int pivotidx = lo;
        int pivot =arr[lo];
        int count =0;
        for(int i=lo+1;i<n;i++){
            if(pivot>=arr[i])count++;
        }
        int correctidx = pivotidx + count;
        swap(arr,pivotidx,correctidx);
        //partition
        int i = lo;
        int j = hi;
        while(i< correctidx && j>correctidx){
            if(arr[i]<=pivot)i++;
            else if(arr[j] >pivot)j--;
            else if(arr[i]>pivot&&arr[j]<pivot) swap(arr,i,j);
        }
        return  correctidx;


    }
    public static void sort(int[] arr ,int lo, int hi ,int k){
        if(lo>hi) return;
        if(lo==hi){
            if(k-1==lo){
            ans = arr[lo];
            return;}
        }
        int idx =partition(arr,lo,hi);
        if(idx==k-1){
            ans = arr[idx];
            return;
        }
         else if(idx>k-1)sort(arr, lo, idx-1,k);
        else if(idx<k-1) sort(arr, idx+1, hi,k);
    }
    public static void main(String[] args) {
        int[] arr = { 6,5 , 7 ,20,12 ,51 ,35 ,26 ,2 ,4};
        print(arr);
        int n=arr.length;
        ans =-1;
        int k =2;
        sort(arr,0,n-1,n-k+1);
        System.out.println(ans);
    }
}
