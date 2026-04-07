class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int x : nums) {
            if (!set.add(x)) {
                return x;
            }
        }
        return 0;
    }
}
