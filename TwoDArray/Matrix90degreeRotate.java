public class Matrix90degreeRotate {
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
        //Transposing.........
        for(int i=0 ;i< m; i++){
            for(int j =0 ; j<i ; j++){
                
                int temp =arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;

            }
        }
        print(arr);
        //rotate -> reverse each rows.....
        for(int i =0 ; i< m ; i++){
        int a = 0;
        int b = m-1;
        while(a<b){
                int x =arr[i][a];
                arr[i][a] = arr[i][b];
                arr[i][b] = x;
                a++;
                b--;
        }
    }
         print(arr);

    }
}
