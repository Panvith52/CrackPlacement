public class ConsecOnes {
    public static void main(String[] args) {
        System.out.println(findMaxConsecutiveOnes(new int[]{1,0,1,1,0,1}));
        String s = "janani";
        System.out.println(s.indexOf("a")); // Output: 2
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int maxCount=0;
        for(int num:nums){
            if(num==1){
                count+=1;
                maxCount = Math.max(count,maxCount);
            }
            else{
                count=0;
            }
        }
        return maxCount;
    }
}
