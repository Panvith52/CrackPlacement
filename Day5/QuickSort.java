import java.util.*;
public class QuickSort{
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(6,1,9,5,4));
        List<Integer> arr1 = new ArrayList<>(Arrays.asList(3,4,8,2,4));
        quickSort(arr,0,arr.size()-1);
        quickSort(arr1,0,arr.size()-1);
        int n = arr.size();
        long maxProductSum = 0;
        for(int i=0;i<n;i++){
            maxProductSum += arr.get(i)*arr1.get(n-i-1);
        }
        System.out.println("Maximum product sum of pairwise products of elements from both arrays is: " + maxProductSum);
    }
    static void swap(List<Integer> arr,int i,int j){
        int temp = arr.get(j);
        arr.set(j, arr.get(i));
        arr.set(i, temp);
    }
    static int partition(List<Integer> arr,int low,int high){
        int pivot = arr.get(high);
        int i = low-1;
        for(int j=low;j<=high-1;j++){
            if(arr.get(j)<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return i+1;
    }
    static void quickSort(List<Integer> arr,int low,int high){
        if(low<high){
            int pi = partition(arr,low,high);
            quickSort(arr,low,pi-1);
            quickSort(arr,pi+1,high);
        }
    }
}