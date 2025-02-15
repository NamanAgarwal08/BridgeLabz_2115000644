public class FirstAndLastOccurrence {

    public static int findFirstOcc(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int first = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                first = mid;
                right = mid - 1;
            } else if (nums[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return first;
    }

    public static int findLastOcc(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int last = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                last = mid;
                left = mid + 1;
            } else if (nums[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        
        return last;
    }

    public static int[] searchRange(int[] nums, int target) {
        return new int[] { findFirstOcc(nums, target), findLastOcc(nums, target) };
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 2, 3, 4, 5 };
        int target = 2;
        int[] ans = searchRange(nums, target);
        System.out.println("First occurrence: " + ans[0] + ", Last occurrence: " + ans[1]);
    }
}
