class Solution {
    public int maxSubArray(int[] nums) {
        int bestans=nums[0];
        int ans=nums[0];
        for(int i=1;i<nums.length;i++){
            int v1=nums[i];
            int v2=nums[i]+bestans;
            bestans=Math.max(v1,v2);
            ans=Math.max(bestans,ans);
        }
        return ans;
    }
}