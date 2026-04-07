class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] maxes = new int[nums.length-k+1];

        for (int x = 0; x < nums.length; x++) {
            int currMax = nums[x];
            if (x+k > nums.length) {
                return maxes;
            }
            for (int y = 1; y < k; y++) {
                currMax = Math.max(nums[x+y], currMax);
            }
            maxes[x] = currMax;
        }

        return maxes;
    }
}

