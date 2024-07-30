//Problem Statement: Given an array of numbers, print all subsets of it using bitwise operators.
import java.util.ArrayList;
public class Bits3 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        ArrayList<ArrayList<Integer>> subsets = getSubsets(arr);
        for (ArrayList<Integer> subset : subsets) {
            System.out.println(subset);
        }
    }
    public static ArrayList<ArrayList<Integer>> getSubsets(ArrayList<Integer> arr) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int num_subsets = (int) Math.pow(2, arr.size());
        for (int i = 0; i < num_subsets; i++) {
            ArrayList<Integer> subset = new ArrayList<>();
            for (int j = 0; j < arr.size(); j++) {
                if ((i & (1 << j))!= 0) {
                    subset.add(arr.get(j));  // Bitwise AND operation to check if the jth bit is);
                }
            }
            result.add(subset);
        }
        return result;
    }
}
