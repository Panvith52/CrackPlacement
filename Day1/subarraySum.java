import java.util.ArrayList;

public class subarraySum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(subarrSum(arr, 5, 14));
    }
    public static ArrayList<Integer> subarrSum(int[] arr, int n, int s) {
        // code here
        ArrayList<Integer> path = new ArrayList<>();
        int sum=0;
        int left=0,right=0;
        while(right<arr.length && left<=right){
            sum += arr[right];
            if(sum<s){
                right++;
            }
            if(sum==s){
                path.add(left+1);
                path.add(right+1);
            }
            if(sum>s && left!=right){
                sum-=arr[left];
                left++;
                if(sum==s){
                    path.add(left+1);
                    path.add(right+1);
                }
            }else{
                left++;
                right++;
                if(sum==s){
                    path.add(left+1);
                    path.add(right+1);
                }
            }
        }
        return path;
    }
}
