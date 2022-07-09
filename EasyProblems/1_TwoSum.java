// Problem: https://leetcode.com/problems/two-sum/

class Solution {

    // Map solution when array is unsorted.
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[0] = i;
                result[1] = map.get(target - nums[i]);
                return result;
            }

            map.put(nums[i], i);
        }

        return result;
    }

    // Two Pointer solution when array is sorted.
    public int[] twoSum1(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;

        while (i < j) {
            if (nums[i] + nums[j] == target) {
                int[] result = { i, j };
                return result;
            }

            if (nums[i] + nums[j] > target) {
                j--;
            } else {
                i++;
            }
        }

        return new int[0];
    }
}