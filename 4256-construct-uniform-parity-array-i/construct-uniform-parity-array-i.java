class Solution {
    public boolean uniformArray(int[] nums1) {
        for (int num : nums1) {
            if (num % 2 != 0) return true;
        }
        return true;
    }
}