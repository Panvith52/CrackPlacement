public class Kadane {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -2, 5};
        System.out.println(maxSum(arr));
    }
    public static int maxSum(int[] arr){
        int sum=0;
        int max_sum=Integer.MIN_VALUE;
        for(int i:arr){
            sum+=i;
            if(sum>max_sum){
                max_sum=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return max_sum;
    }
}
