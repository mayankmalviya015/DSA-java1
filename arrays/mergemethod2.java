public class mergemethod2 {
    public static void main(String[] args) {
        int[] arr ={12 , 34 , 45 ,58 ,68 ,79 };
        int[] nums ={ 0 , 1 , 42 ,56 ,85 ,97 };
        int a = arr.length;
        int b = nums.length;
        int[] br = new int[a +b];
        int c = br.length;
        int i= a-1 , j = b-1, k= c-1 ;
        while(i>=0 && j >=0){
            if(arr[i]>= nums [j]){
                br[k] = arr[i];
                i--;
                k--;
            }
            else {
                br[k] = nums[j];
                j--;
                k--;
            }
                while(i>=0){
                    br[k] =arr[i];
                    i--;
                    k--;
            }
                while(j>=0){
                    br[k] =nums[j];
                    j--;
                    k--;
            }
            }
            for (int ele : br)System.out.print(ele+ " ");
        }

    }

