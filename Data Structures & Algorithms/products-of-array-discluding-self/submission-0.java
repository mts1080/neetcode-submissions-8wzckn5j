class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int[] ret = new int[nums.length];
        int zeroes = 0;

        for (int x = 0; x < nums.length; x ++) {
            if (nums[x]==0) {
                zeroes++;
                if (zeroes > 1) {
                    return new int[nums.length];
                }
                ret[x] = -1;
            } else {
                product *= nums[x];
            }
        }

        for (int x = 0; x < ret.length; x++) {
            if (nums[x]!=0 && zeroes > 0) {
                ret[x] = 0;
            } else if (nums[x] == 0 && zeroes == 1) {
                ret[x] = product;
            } else {
                ret[x] = product / nums[x];
            }
        }

        return ret;
    }
}  
