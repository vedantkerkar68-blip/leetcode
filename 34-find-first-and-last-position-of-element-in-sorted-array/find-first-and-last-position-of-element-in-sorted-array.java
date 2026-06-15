class Solution {
    public int[] searchRange(int[] nums, int target) {
         int[] result = new int[]{-1, -1};
        result[0] = findBoundary(nums, target, true);
        if (result[0] != -1) {
            result[1] = findBoundary(nums, target, false);
        }
        return result;
    }

    private int findBoundary(int[] nums, int target, boolean isLeft) {
        int start = 0;
        int end = nums.length - 1;
        int index = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                index = mid;
                if (isLeft) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return index;
}}