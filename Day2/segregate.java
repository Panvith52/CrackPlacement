import java.util.*;
public class segregate {
    public static void main(String[] args) {
        int[] arr = {0, 0,0,1,1,1,0};
        segr(arr);
        System.out.println("Segregated array: "+Arrays.toString(arr));
    }
    public static void segr(int[] arr){
        int start = 0;
        int end = arr.length-1;;
        int mid = 0;
        while(mid<=end){
            switch (arr[mid]) {
                case 0:
                    int tmep = arr[start];
                    arr[start] = arr[mid];
                    arr[mid] = tmep;
                    mid++;
                    start++;
                    break;
                case 1:
                    int temp1 = arr[mid];
                    arr[mid] = arr[end];
                    arr[end] = temp1;
                    end--;
                    break;
            }
        }
    }
}
