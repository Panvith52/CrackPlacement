import java.util.*;

public class indxSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5};
        int sum=14;
        System.out.println(sum(arr, sum));
    }
    public static ArrayList<Integer> sum(int[] arr,int sum){
        ArrayList<Integer> path = new ArrayList<>();
        int start = 0,last=0;
        int current_sum = 0;
        boolean flag = false;
        for(int i=0;i<arr.length;i++){
            current_sum += arr[i];
            if(current_sum>=sum){
                last =i;
                while(sum<current_sum && start<i){
                    current_sum-=arr[start];
                    start++;
                }
                if(current_sum==sum){
                    path.add(start+1);
                    path.add(last+1);
                    flag=true;
                    break;
                }
            }
        }
        if(!flag)
            path.add(-1);
        return path;
    }
}
