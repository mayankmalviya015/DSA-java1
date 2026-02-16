public class DecreasingBubbleSort{
    public static void main(String[] args){
        int[] arr ={1 , 2,3 ,4 ,5 ,6};
        int n = arr.length;
        for(int x =0; x<n;x++){
            for(int i=n-1;i>0;i--){
                if(arr[i]>arr[i-1]){
                     int term = arr[i];
                    arr[i] =arr[i-1];
                    arr[i-1] =term;

                }
            }
        }
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}