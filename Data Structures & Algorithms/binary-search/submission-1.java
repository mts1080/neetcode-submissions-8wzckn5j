class Solution {
    public int search(int[] nums, int target) {
        int lb = 0;
        int rb = nums.length - 1;
        int index = nums.length / 2;
        int prevIndex = 0;

        if (rb < 0) {
            return -1;
        }

        if (lb == rb) {
            if (nums[lb] == target) {
                return lb;
            } else {
                return -1;
            }
        }

        while (index != prevIndex) {
            prevIndex = index;
            if (nums[index] > target) {
                rb = index-1;
                index = (lb+rb)/2;
            } else if (nums[index] < target) {
                lb = index+1;
                index = (lb+rb)/2;
            } else {
                return index;
            }
        }
        return -1;
    }
}
