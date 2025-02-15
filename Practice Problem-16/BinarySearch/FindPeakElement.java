public class FindPeakElement {
    
    public static int findPeakIdx(int arr[]) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]) {
                return mid;
            }
            if (arr[mid] < arr[mid - 1]) {
                right = mid - 1;
            }
            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            }
        }

        return -1;
    }
    
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 2, 1 }; //dummy
        
        System.out.println(findPeakIdx(arr));
    }
}
