public class SpiralMatrix {
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
    int[][] arr = {{1 ,2 ,3},{4 ,5 ,6},{7 , 8 , 9}};
        int m=arr.length;
    int n= arr[0].length;
    print(arr);
    int minr =0; 
    int minc =0 ;
    int maxr = m-1;
    int maxc = n-1;
    while(minr <= maxr && minc <= maxc){
            for(int j = minc ; j<=maxc; j++ ){
                System.out.print(arr[minr][j]);
            }
            minr++;
            if(minr>maxr || minc>maxc)
                break;
            for(int j =minr ; j<=maxr; j++){
                System.out.print(arr[j][maxc]);
            }
            maxc--;
            if(minr > maxr || minc> maxc)break;
        for(int j = maxc ; j>=minc; j-- ){
                System.out.print(arr[maxr][j]);
            }
            maxr--;
            if(minr > maxr || minc > maxc)break;
            for(int j =maxr ; j>=minr ; j--){
                System.out.print(arr[j][minc]);
            }
            minc++;
    }

}
}