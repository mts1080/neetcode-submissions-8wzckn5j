class Solution {
    public int findMin(int[] nums) {
        int lb = 0;
        int rb = nums.length-1;
        int ind = nums.length/2;
        int currMin = 10000;
        int tempMin = -1;

        if (nums[lb] < nums[rb] || lb == rb) {
            return nums[lb];
        }

        while (currMin != tempMin) {
            tempMin = currMin;
            int currSpot = nums[ind];
            currMin = Math.min(currSpot, currMin);
            
            if (currSpot > nums[rb]) {
                currMin = nums[rb];
                lb = ind+1;
                ind = (lb+rb)/2;
            } else if (currSpot > nums[ind-1]) {
                ind--;
                while (nums[ind] > nums[ind-1]) {
                    ind--;
                }
                return nums[ind];
            }
        }

        return currMin;
    }
}
