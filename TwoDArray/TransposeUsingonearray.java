public class TransposeUsingonearray {
    public static void print(int[][] arr){
              for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        //this is use only square matrix.....
        int[][] arr ={{1 ,2 ,3},{4 ,5 ,6},{7 , 8 , 9}};
        print(arr);
        int m = arr.length; // in square matrix m = n
        for(int i=0 ;i< m; i++){
            for(int j =0 ; j<i ; j++){
                //swap......
                int temp =arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

         print(arr);

    }
}
