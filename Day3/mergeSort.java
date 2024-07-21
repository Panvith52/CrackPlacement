import java.util.*;
public class mergeSort {
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        System.out.println(Arrays.toString(megesort(arr)));
    }
    public static int[] megesort(int[] arr){
        if(arr.length <= 1){
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = megesort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = megesort(Arrays.copyOfRange(arr, mid, arr.length));

        int[] mix = merge(left, right);
        return mix;
    }
    private static int[] merge(int[] left, int[] right){
        int[] mix = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while(i < left.length && j < right.length){
            if(left[i] <= right[j]){
                mix[k++] = left[i++];
            }else{
                mix[k++] = right[j++];
            }
        }
        while(i < left.length){
            mix[k++] = left[i++];
        }
        while(j < right.length){
            mix[k++] = right[j++];
        }
        return mix;
    }
}