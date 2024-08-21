import java.util.*;
public class Problem3 {
    public static void main(String[] args) {
        int[] arr = {2,2};
        int n = arr.length;
        System.out.println(Arrays.toString(findTwoElement(arr, n))); 
    }
    public static int[] findTwoElement(int arr[], int n) {
        // code here
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] result = new int[2];
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int i=0;i<n;i++){
            if(map.get(arr[i])>1){
                result[0] = arr[i];
            }
        }
        for(int i=1;i<=n;i++){
            if(!map.containsKey(i))
                result[1]=i;
        }
        return result;
    }
}
