//find the sqare root of a number without using any built-in square root functions or libraries

public class Sqrt {
    public static void main(String[] args) {
        System.out.println(sqrte(5));
    }
    public static int sqrte(int n){
        int start = 0, end = n, ans = -1;
        
        while(start <= end){
            int mid = (start + end) / 2;
            
            if(mid * mid == n){
                ans = mid;
                break;
            }
            
            if(mid * mid < n){
                start = mid + 1;
                ans = mid;
            }
            else{
                end = mid - 1;
            }
        }
        
        return ans;
    }
}
