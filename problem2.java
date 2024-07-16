import java.util.*;

public class problem2 {
    public static void main(String[] args) {
        int[] nums = {3,2,1,4};
        int k = 3;
        System.out.println(findKthLargest(nums,k));
    }
    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[k];
    }
}
