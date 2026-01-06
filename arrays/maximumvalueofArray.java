public class maximumvalueofArray {
    public static void main(String[] args) {
        int[] arr = {4, 5 ,1 ,2 ,4 ,8 ,6 ,2 };
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
             max = Math.max(max, arr[i]);
        }
        System.out.println(max);
    }
}
