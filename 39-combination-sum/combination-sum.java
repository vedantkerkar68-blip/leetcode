class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> l=new ArrayList<>();
        Arrays.sort(candidates);
        find(0,target,new ArrayList<>(),candidates,l);
        return (l);
    }
    public static void find(int idx,int target,List<Integer> ans,int candidates[], List<List<Integer>> l){
        if(target==0){
            l.add(new ArrayList<>(ans));
            return;
        }
        for(int i=idx;i<candidates.length;i++){
            if(target>=candidates[i]){
                ans.add(candidates[i]);
                find(i,target-candidates[i],ans,candidates,l);
                ans.remove(ans.size()-1);
            }
        }
    }
}