import java.util.*;

public class Duplicates {
    public static void main(String[] args) {
        int[] arr = {1,2,6,3,4,5};
        System.out.println(duplicates(arr));
    }
    public static ArrayList<Integer> duplicates(int[] arr) {
        // code here
        ArrayList<Integer> path = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
            
            if(map.get(i)>1)
                path.add(i);
        }
        if(path.size()==0){
            path.add(-1);
            return path;
        }
        return path;
        
    }
}