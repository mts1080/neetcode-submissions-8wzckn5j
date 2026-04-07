class Solution {
    public int majorityElement(int[] nums) {
        int count = nums.length / 2;
        if (nums.length % 2 == 1) {
            count++;
        }
        
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0)+1);
            if (map.get(x) == count) {
                return x;
            }
        }

        return count;
    }
}