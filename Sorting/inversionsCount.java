public class inversionsCount {
    static int count =0;
    public static void inversion(int[] first ,int[] second){
        int i=0,j=0;
        while(i<first.length && j<second.length)
            if(first[i]>second[j]){
                count += first.length-i;
                j++;
            }
            else i++;
    }
    public static void merge2array(int[] first ,int[] second, int[] arr){
        int a =first.length ,b= second.length;
            int i=0, j =0 , k= 0 ;
        while(i< a && j<b){
            if(first[i] <= second[j]){
                arr[k] = first[i];
                k++;
                i++;
            }
            else { //first[i] >second[j]
                // count += first.length -i;
                arr[k] = second[j];
               k++;
               j++;
        }
        }
            while(j<b){
                arr[k]= second[j];
                k++;
                j++;
            }
            while(i<a){
                arr[k]= first[i];
                k++;
                i++;
            }
        }
        public static void merge(int[] arr){
            int n= arr.length;
            if(n==1) return; //basecase
            //Create two new array
            int[] first = new int[n/2];
            int[] second =new int[n-n/2];
            //copy these values...
            for(int i =0;i<n/2;i++){
                first[i] = arr[i];
            }
            for(int i =0;i<n-n/2;i++){
                second[i] = arr[i+n/2];
            }
            // apply recursion....
            merge(first);
            merge(second);
            inversion(first,second);
            // merge two sorted array.
            merge2array(first,second,arr);
        }
    public static void main(String[] args) {
        int[] arr= {8 ,2 ,5 ,3 ,1 ,4};
        merge(arr);
        System.out.println(count);
    }
}
