
import java.util.*;

public class kSortedArray {


    
    public static void main(String[] args) {
        int[] arr ={3,1,4,2,5};
        int k =2;
        ArrayList<Integer> al = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i =0;i<arr.length;i++){
            pq.add(arr[i]);
            if(pq.size()>k){
                al.add(pq.peek());
                pq.remove();
            }
        }
        while(pq.size()>0){
            al.add(pq.peek());
            pq.remove();
        }
        System.out.println(al);
    }
}
