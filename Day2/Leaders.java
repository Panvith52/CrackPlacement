import java.util.*;

public class Leaders {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5,2};
        int n = arr.length;;
        System.out.println("Leaders are: " + lead(arr, n));
    }
    public static ArrayList<Integer> lead(int[] arr,int n){
        ArrayList<Integer> path = new ArrayList<>();
        int c = arr[n-1];
        path.add(c);
        for(int i=n-2;i>=0;i--){
            if(c<=arr[i]){
                c=arr[i];
                path.add(c);
            }
        }
        return reverse(path);
    }
    public static ArrayList<Integer> reverse(ArrayList<Integer> path){
        ArrayList<Integer> gate = new ArrayList<>();
        for(int i=path.size()-1;i>=0;i--){
            gate.add(path.get(i));
        }
        return gate;
    }
}
