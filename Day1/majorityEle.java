import java.util.HashMap;

public class majorityEle {
    public static void main(String[] args) {
        int[] arr = {3,1,2,3,3,3};
        System.out.println(majority(arr));
    }
    public static int majority(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        int freq = arr.length/2;
        for(int i:arr){
            map.put(i,map.getOrDefault(i, 0)+1);
            if(map.get(i)>freq){
                return i;
            }
        }
        return -1;
    }
}
