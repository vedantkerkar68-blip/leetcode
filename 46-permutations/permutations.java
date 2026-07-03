class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> l=new ArrayList<>();
        find(new ArrayList<>(),nums,l);
        return l;
    }
    public static void find(List<Integer> ans,int nums[], List<List<Integer>> l){
        if(ans.size()==nums.length){
            l.add(new ArrayList<>(ans));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(ans.contains(nums[i])==false){
                ans.add(nums[i]);
                find(ans,nums,l);
                ans.remove(ans.size()-1);
            }
        }
    }
}