class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        int[] empty = {};
        int[] sol;
        if (len < 3) {
            if (nums[0] + nums[1] == target) {
                sol = new int[] { 0, 1 };
                return sol;
            } else {
                sol = new int[] {};
                return sol;
            }
        } else {
            for (int i = 0; i < len; i++) {
                for (int j = i + 1; j < len; j++) {
                    if (nums[i] + nums[j] == target) {
                        sol = new int[] { i, j };
                        return sol;
                    }
                }
            }
            return empty;
        }
    }
}
