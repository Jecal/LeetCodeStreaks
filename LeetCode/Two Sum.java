class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        int[] empty = {};
        int[] sol;
        if (len < 3) {
            if (nums[0] + nums[1] == target) {
                sol = new int[] { nums[0], nums[1] };
                return sol;
            } else {
                sol = new int[] {};
                return sol;
            }
        } else {
            for (int i = 0; i < len; i++) {
                for (int j = 0; j < len; j++) {
                    if (i != j) {
                        if (nums[i] + nums[j] == target) {
                            sol = new int[] { nums[i], nums[j] };
                            return sol;
                        }
                    }

                }
            }
            return empty;
        }

    }
}