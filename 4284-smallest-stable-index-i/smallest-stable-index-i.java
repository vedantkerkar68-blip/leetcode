class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        
        int[] leftMax = new int[n];
        int currentMax = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            currentMax = Math.max(currentMax, nums[i]);
            leftMax[i] = currentMax;
        }
      
        int[] rightMin = new int[n];
        int currentMin = Integer.MAX_VALUE;
        for (int i = n - 1; i >= 0; i--) {
            currentMin = Math.min(currentMin, nums[i]);
            rightMin[i] = currentMin;
        }
        
        for (int i = 0; i < n; i++) {
            if (leftMax[i] - rightMin[i] <= k) {
                return i;
            }
        }
        
        return -1;
    }
}