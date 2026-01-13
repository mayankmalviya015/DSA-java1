public class nextgreatestmethod2 {
    public static void main(String[] args) {
        int[] arr ={12 , 45 , 23 , 52 , 62 , 75 , 40 };
        for(int ele : arr)System.out.print(ele+ " ");
        System.out.println();
        int n = arr.length;
        int[] ans = new int[n];
        ans[n-1] =-1;
        int nge = arr[n-1];
        for (int i =n-2; i >=0 ; i--) {
            ans[i] = nge;
            nge = Math.max(nge, arr[i]);
        }
        for(int ele : ans)System.out.print(ele+ " ");
    }
}
