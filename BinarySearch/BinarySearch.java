public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 24 ,35 ,45 ,65 ,74 ,84 ,95};
        int n = arr.length;
        int target = 35;
        boolean flag = false;

        int lo = 0;
        int hi = n - 1;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;

            if (arr[mid] > target)
                hi = mid - 1;
            else if (arr[mid] < target)
                lo = mid + 1;
            else {
                flag = true;
                break;
            }
        }

        if (flag)
            System.out.println("Yes, present in this array");
        else
            System.out.println("Target is not present");
    }
}
