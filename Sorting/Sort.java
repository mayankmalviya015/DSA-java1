package Sorting;

public class Sort {
    public static void main(String[] args) {
        boolean x =true;
        int[] arr={1, 3, 4, 5, 6, 7,8};
        for(int i=0; i<arr.length -1; i++){
            if(arr[i]>=arr[i+1])
                x= false;
        }
        if(x==true)
            System.out.println(" sorted");
        else System.err.println(" unsort");

    }
}
