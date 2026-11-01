class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashSet<Integer> find=new HashSet<>();
        for(int i:nums){
            if(!find.add(i)){
                return true;
            }
        }
        return false;
    }
}