import java.util.*;
public class Problem1{
    public static void main(String[] args) {
        List<List<Integer>> arrays = new ArrayList<>();
        arrays.add(Arrays.asList(1,4,5));
        arrays.add(Arrays.asList(0,3));
        System.out.println(maxDistance(arrays)); // Output: 8
    }
    public static int maxDistance(List<List<Integer>> arrays){
        int max = -100000;
        int min = 100000;
        int maxDist = 0;
        for(List<Integer> A : arrays){
            maxDist = Math.max(maxDist,Math.max(A.get(A.size()-1)-min,max-A.get(0)));
            max = Math.max(max,A.get(A.size()-1));
            min = Math.min(min,A.get(0));

        }
        return maxDist;
    }
}