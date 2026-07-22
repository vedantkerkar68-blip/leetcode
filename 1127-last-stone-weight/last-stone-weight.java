class Solution {
    public int lastStoneWeight(int[] stones) {
          List<Integer> list = new ArrayList<>();
        for (int stone : stones) {
            list.add(stone);
        }
 
        while (list.size() > 1) {
            int max1 = Collections.max(list);
            list.remove((Integer) max1);
 
            int max2 = Collections.max(list);
            list.remove((Integer) max2);
 
            if (max1 != max2) {
                list.add(max1 - max2);
            }
        }
 
        return list.isEmpty() ? 0 : list.get(0);
    }
}