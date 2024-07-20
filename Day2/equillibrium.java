public class equillibrium {
    public static void main(String[] args) {
        long[] arr = {1,2,3};
        System.out.println("Equi-index: " + equi(arr));
    }
    public static int equi(long[] arr) {
        int total_sum = 0;
        for (long num : arr) {
            total_sum += num;
        }
        long left_sum = 0;
        for (int i = 0; i < arr.length; i++) {
            total_sum -= arr[i];
            if (left_sum == total_sum) {
                return i+1;
            }
            left_sum += arr[i];
        }
        return -1;
    }
    
}
