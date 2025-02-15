public class RotatedSortedArray {
    
    public static int findSmallestIdx(int arr[]) {
        int low = 0;
        int high = arr.length - 1;
        int mid = (low + high) / 2;

        while (low < high) {
            mid = (low + high) / 2;
            if (arr[mid] < arr[high]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 1, 3 }; //dummy array

        System.out.println(findSmallestIdx(arr));
    }
}