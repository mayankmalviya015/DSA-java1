public class SelectionSortmxLast {
    public static void main(String[] args) {
        int[] arr ={5 , 4 ,3 ,2 ,1};
        int n = arr.length;
        for(int x=0;  x<n-1;x++){
            int mx =Integer.MIN_VALUE;
            int idx =-1;
            for(int i=0; i<n-x ;i++){
                if(arr[i]>mx){
                    mx =arr[i];
                    idx = i;
                }
            }

            int term =arr[n-1-x];
        arr[n-1-x] =arr[idx];
        arr[idx] =term;

        }
        for(int ele : arr){
            System.err.print(ele+ " ");
        }
    }
}
