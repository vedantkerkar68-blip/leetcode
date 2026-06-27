class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int water=0;
        int ans=0;
        while(left < right) {
            if(height[left]<height[right]){
                water=height[left]*(right-left);
                left++;
            }
            else{
                water=height[right]*(right-left);
                right--;
            }
            if(ans<water){
                ans=water;
            }
        }
        return ans;
        
    }

}