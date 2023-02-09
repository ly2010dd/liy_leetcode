public class Java0704Solution {
    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target == nums[mid]) {
                return mid;
            }
            if (target < nums[mid]) {
                right = mid - 1;
            }
            if (target > nums[mid]) {
                left = mid + 1;
            }
        }
        return -1;
    }
}