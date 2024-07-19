//https://www.geeksforgeeks.org/problems/second-largest3735/1
public class problem1{
    public static void main(String[] args) {
        int[] arr = {2,5,4,3,2};
        System.out.println(SecondLarge(arr));
    }
    public static int SecondLarge(int[] arr){
        int max1=-1;
        int max2=-1;
        for(int i:arr){
            if(max1<i){
                max2=max1;
                max1=i;
            }else if(max2<i && i!=max1){
                max2=i;
            }
        }
        return max2;
    }
}