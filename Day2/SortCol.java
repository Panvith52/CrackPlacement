import java.util.Arrays;

public class SortCol{
    public static void main(String[] args) {
        int[] arr = {0,1,2,1,2,0};
        int[] a = sortC(arr);;
        System.out.println(Arrays.toString(a));
    }
    public static int[] sortC(int[] nums){
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {
            switch (nums[mid]) {
                case 0:
                    // Swap nums[low] and nums[mid]
                    int temp0 = nums[low];
                    nums[low] = nums[mid];
                    nums[mid] = temp0;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    // Swap nums[mid] and nums[high]
                    int temp2 = nums[mid];
                    nums[mid] = nums[high];
                    nums[high] = temp2;
                    high--;
                    break;
            }
        }
        return nums;
    }
}