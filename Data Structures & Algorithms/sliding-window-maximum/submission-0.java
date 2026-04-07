class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] maxes = new int[nums.length-k+1];

        for (int x = 0; x < nums.length; x++) {
            int currMax = nums[x];
            if (x+k > nums.length) {
                return maxes;
            }
            for (int y = 1; y < k; y++) {
                System.out.print(Integer.toString(nums[x+y]));
                if (nums[x+y] > currMax) {
                    currMax = nums[x+y];
                }
            }
            maxes[x] = currMax;
            System.out.println("\nCurrent Maxes: " + Arrays.toString(maxes));
        }

        return maxes;
    }
}
