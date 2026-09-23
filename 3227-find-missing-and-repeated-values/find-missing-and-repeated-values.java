class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        Set<Integer> set = new HashSet<>();
        int i = 0;
        int arr[] = new int[2];
        for(int row[] : grid){
            for(int num : row){
                if(set.contains(num)) arr[i++] = num;
                else set.add(num);
            }
        }
        int n = grid.length * grid.length;
        for(int j = 1; j <= n; j++){
            if(!set.contains(j)){
                arr[i] = j;
                break;
            } 
        }
        return arr;
    }
}