class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }

        HashSet<Integer> set = new HashSet<>();

        int tally = 1;
        int max = 0;

        for (int num : nums) {
            tally = 1;
            if (set.add(num)) {
                int temp = num;
                while (set.contains(--temp)) {
                    tally ++;
                }
                temp = num;
                while (set.contains(++temp)) {
                    tally ++;
                }
                max = Math.max(max, tally);
            }
        }

        return max;
    }
}
