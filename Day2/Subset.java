import java.util.HashMap;

public class Subset{
    public static void main(String[] args) {
        long[] a1 = {1,2,3,4,5,6,6,7,8,9,9};
        long[] a2 = {1,2,3,4,5};
        System.out.println(subsetAr(a1, a2));
    }
    public static String subsetAr(long[] a1, long[] a2){
        HashMap<Long, Integer> map = new HashMap<>();
        for(long i:a1){
            map.put(i,map.getOrDefault(i, 0)+1);
        }
        for(long i:a2){
            if(!map.containsKey(i)||map.get(i)==0){
                return "No";
            }
        }
        return "Yes";
    }
}