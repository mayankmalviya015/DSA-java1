public class NextGreatestElement {
    public static void main(String[] args) {
    int[] arr = {21 ,45 , 12 , 48 , 43 , 54 , 23 };
     for(int ele : arr)System.out.print(ele+ " ");
     System.out.println();
    int n = arr.length;
    int[] brr = new int[n];
    brr[n-1] = -1;
        for (int i = 0 ; i <n-1; i++) {
            int mx = Integer.MIN_VALUE;
            for (int j = i+1; j < n; j++) {
                mx = Math.max(mx , arr[j]);
            }
            brr[i] = mx;
        }
        for(int ele : brr)System.out.print(ele+ " ");
    }
}
