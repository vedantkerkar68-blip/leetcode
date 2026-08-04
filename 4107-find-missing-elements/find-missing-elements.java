class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);

        int min = nums[0];
        int max = nums[nums.length - 1];

        HashSet<Integer> set = new HashSet<>();
        for (int i = min; i <= max; i++) {
            if (!set.contains(i)) {
                set.add(i);
            }
        }
        for (int num : nums) {
            set.remove(num);
        }
        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list);

        return list;
    }
}