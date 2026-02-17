public class question{
    public static void print(int[] arr){
        for(int ele: arr){
            System.err.print(ele+ " ");
            
        }System.err.println(); 

   }
    public static void main(String[] args) {
        int[] arr ={ 43,65,23,73,100,4};
        print(arr);
        int n = arr.length;
        int x =0;
        for(int i =0;i<n;i++){
            int min =Integer.MAX_VALUE;
            int mindx =-1;
            for(int j=0 ;j<n;j++){
                if(arr[j]<min && arr[j]>0){
                    min = arr[j];
                    mindx =j;
                }
            }
            arr[mindx] =x;
            x--;
        }
        print(arr);
        for(int i =0; i<n ;i++){
            arr[i] *=(-1);
        }
        print(arr);
    }
}