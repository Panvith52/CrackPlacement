import java.util.*;
public class CountSmall {
    public static void main(String[] args) {
        int[] arr = {12, 1, 2, 3, 0, 11, 4};
        System.out.println("Count of smaller elements: " + Small(arr));
    }
    public static ArrayList<Integer> Small(int[] arr){
        ArrayList<Integer> path = new ArrayList<>();;
        for(int i=0;i<arr.length;i++){
            int c = arr[i];
            int count = 0;
            for(int j=i;j<arr.length;j++){
                if(c>arr[j]){
                    count++;
                }
            }
            path.add(count);
        }
        return path;
    }
}
