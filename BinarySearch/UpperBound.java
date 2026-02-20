public class UpperBound {
    public static void main(String[] args) {
        int[] arr = {1, 25 ,45 ,69 ,75 ,85 ,85 ,95 ,99};
        int n =arr.length;
        int lb = n;
        int target =85;
        int lo =0;
        int hi =n-1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid]>target){
                lb = Math.min(mid, lb);
                hi=mid-1;}
                else
                     {lo =mid+1;}
            }
            System.err.println(lb);
        
        }
    }