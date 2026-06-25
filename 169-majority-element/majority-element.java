class Solution {
    public int majorityElement(int[] nums) {
        int vote=0;
        int cand=0;
        for(int i=0;i<nums.length;i++){
            if(vote==0){
                vote=1;
                cand=nums[i];
            }
            else if(cand==nums[i]){
                vote++;
            }
            else{
                vote--;
            }
        }
        return cand;
    }
}