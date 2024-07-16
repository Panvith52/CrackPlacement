//problem link:https://www.geeksforgeeks.org/problems/replace-all-0s-with-5/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article

public class problem1 {
    public static void main(String[] args) {
        System.out.println(replace(1004));
    }
    public static int replace(int n){
        if(n==0)
            return 5;
        int ans = 0;
        int mul = 1;
        while(n>0){
            int num = n%10;
            n/=10;
            if(num==0){
                ans = mul*5+ ans;
            }else{
                ans = mul*num+ans;
            }
            mul*=10;
        }
        return ans;
    }
}
