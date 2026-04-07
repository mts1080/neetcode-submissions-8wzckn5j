class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int ind = 0; ind < nums.length; ind += 1) {
            if (map.containsKey(target - nums[ind])) {
                int[] ret = {map.get(target - nums[ind]), ind};
                return ret;
            }
            map.put(nums[ind], ind);
        }
        return new int[] {0, 0};
    }
}
