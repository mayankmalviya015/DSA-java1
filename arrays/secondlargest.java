public class secondlargest{
public static void main(String[] args) {
    int[] arr = {5 , 1 , 2 , 4 , 725 , 6 , 356 ,   1 , 7 , 1};
    int mx = Integer.MIN_VALUE;
    for (int i = 1; i < arr.length; i++) {
        if(arr[i]>mx)
            mx = arr[i];
        }
        int mn = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(mx != arr[i])
                mn = Math.max(mn , arr[i]);

        }
        System.out.println(mn);
    }
}



