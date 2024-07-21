public class rotateArray {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1, 2};
        int target = 5;
        System.out.println("Index: " + rotateSearch(arr, target));
    }
    public static int rotateSearch(int[] arr, int target) {
        int pivotIndex = findPivote(arr);
        if(pivotIndex== -1) {
            return BinarySearch(arr, target, 0, arr.length-1);
        }
        if(target>arr[0]){
            return BinarySearch(arr, target, 0, pivotIndex);
        }
        return BinarySearch(arr, target, pivotIndex+1, arr.length-1);
    }    
    public static int BinarySearch(int[] arr, int target,int start, int end) {
        while(start<=end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] == target) {
                return mid;
            }
            if(arr[mid]<target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
    public static int findPivote(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]>arr[mid+1] && mid<end){
                return mid;
            }
            if(arr[mid]<arr[mid-1] && mid>start){
                return mid-1;
            }
            if(arr[mid]<=arr[start]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
