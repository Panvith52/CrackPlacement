import java.util.*;
public class problem2 {
    public static void main(String[] args) {
        int[] nums = {1,0,1,2,1,0};
        System.out.println(Arrays.toString(productArray(nums))); // Output: [2
    }
    public static long[] productArray(int[] nums){
        int n = nums.length;
        long[] res = new long[n];
        int count=0;
        long tot_pro=1;
        long total_pro=1;
        for(int num:nums){
            if(num!=0){
                tot_pro *= num;
            }
            if(num==0)
                count+=1;
            total_pro*=num;
        }
        for(int i=0;i<n;i++){
            if(total_pro==0 && nums[i]!=0){
                res[i]=0;
            }
            if(nums[i]==0 && count>1){
                res[i]=0;
            }
            if(nums[i]==0 && count==1){
                res[i]=tot_pro;
            }
            if(total_pro!=0){
                res[i]=total_pro/nums[i];
            }
        }
        return res;
    }
}
