public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {8 ,4 ,5 ,2 ,3 ,2 ,6 ,2, 4, 8 ,5};
        int n = arr.length;
                for(int ele : arr ){
            System.out.print(ele + " ");
        }
        int i = 0 ; 
        int j = n-1 ;
        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[ j];
            arr[ j] = temp;
            i++ ;
            j--;
        }
        System.out.println();
        for(int ele : arr ){
            System.out.print(ele + " ");
        }
    }
}
