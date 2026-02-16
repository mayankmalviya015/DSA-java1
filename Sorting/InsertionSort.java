public class InsertionSort {
    public static void main(String[] args) {
        int[] arr ={51, 48 ,42 ,25 ,14};
        int n =arr.length;
        for(int i =1 ;i<n;i++){
            for(int j=i; j>=1;j--){
                if(arr[j]<arr[j-1]){
                    int term =arr[j];
                    arr[j] =arr[j-1];
                    arr[j-1] =term;}
                    else break;
                }
            }
            for(int ele: arr){
                System.err.print(ele+ " ");
            }
        }
    }
