//find the kth smallest element in an array
import java.util.*;
public class Problem4 {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20,15};
        int k = 3;
        System.out.println(findKthSmallest(arr, k)); // Output: 7
    }
    public static int findKthSmallest(int[] arr, int k) {
        // code here
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.comparingInt(x -> x));
        for(int num:arr){
            pq.add(num);
            if(pq.size() > k+1){
                pq.poll();
            }
        }
        return pq.peek();
    }
}
