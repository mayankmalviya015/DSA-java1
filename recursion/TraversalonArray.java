public class TraversalonArray{
    public static void print(int i ,int[] arr){
        if(i==arr.length)return;
        System.err.print(arr[i]+ " ");
        print(i+1,arr);
    }
    public static void main(String[] args) {
        int[] arr ={4 ,3 ,2 ,5 ,6 ,7, 8, 9, 456, 654 ,345};
        print(0,arr);
    }
}