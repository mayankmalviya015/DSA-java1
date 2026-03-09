public class mergeSort {
    public static void merge2array(int[] arr ,int[] nums, int[] brr){
        int a =arr.length ,b= nums.length;
            int i=0, j =0 , k= 0 ;
        while(i< a && j<b){
            if(arr[i] <= nums[j]){
                brr[k] = arr[i];
                k++;
                i++;
            }
            else {
                brr[k] = nums[j];
               k++;
               j++;
        }
        }
            while(j<b){
                brr[k]= nums[j];
                k++;
                j++;
            }
            while(i<a){
                brr[k]= arr[i];
                k++;
                i++;
            }
        }
        public static void merge(int[] brr){
            int n= brr.length;
            if(n==1) return;
            int[] arr = new int[n/2];
            int[] nums =new int[n-n/2];
            for(int i =0;i<n/2;i++){
                arr[i] = brr[i];
            }
            for(int i =0;i<n-n/2;i++){
                nums[i] = brr[i+n/2];
            }
            merge(arr);
            merge(nums);
            merge2array(arr,nums,brr);
        }
    public static void main(String[] args) {
        int[] brr= {14, 52 ,1 ,96 ,55 ,42};
        merge(brr);
        for(int ele : brr){
            System.out.print(ele+ " ");
        }

    }
}
