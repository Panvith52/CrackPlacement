import java.util.Arrays;
public class merge2 {
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        mergeSortInplace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSortInplace(int[] arr,int s,int e){
        if(e-s==1){
            return;
        }
        int mid = (s+e)/2;;
        mergeSortInplace(arr,s,mid);
        mergeSortInplace(arr,mid,e);
        mergeInplace(arr,s,mid,e);
    }
    public static void mergeInplace(int[] arr, int s, int mid, int e){
        int[] mix = new int[e-s];
        int i = s;
        int j = mid;
        int k = 0;
        while(i<mid && j<e){
            if(arr[i]<=arr[j]){
                mix[k++] = arr[i++];
            } else {
                mix[k++] = arr[j++];
            }
        }
        while(i<mid){
            mix[k++] = arr[i++];
        }
        while(j<e){
            mix[k++] = arr[j++];
        }
        for(i=s; i<e; i++){
            arr[i] = mix[i-s];
        }
    }
}
