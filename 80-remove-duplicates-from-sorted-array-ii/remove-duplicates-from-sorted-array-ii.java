class Solution {
    public int removeDuplicates(int[] nums) {
         int writeIndex = 0;
              for (int currentNum : nums) {
            if (writeIndex < 2 || currentNum != nums[writeIndex - 2]) {
                nums[writeIndex] = currentNum;
                writeIndex++;
            }
        }
              return writeIndex;
    }
}