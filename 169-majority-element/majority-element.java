class Solution {
    public int majorityElement(int[] nums) {
        int cand=0;
        int vote=0;
        for(int i=0;i<nums.length;i++){
            if(vote==0){
                vote=1;
                cand=nums[i];
            }
            else if(nums[i]==cand){
                vote++;
            }
            else{
                vote--;
            }
            
        }
        return cand;   
    }
}