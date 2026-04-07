class Solution {
    public int maxArea(int[] heights) {
        int currMax = 0;

        int lw = 0;
        int rw = heights.length - 1;

        while (lw < rw) {
            currMax = Math.max((rw-lw)*Math.min(heights[lw], heights[rw]), currMax);
            if (heights[lw] < heights[rw]) {
                lw++;
            } else {
                rw--;
            }
        }

        return currMax;
    }
}
