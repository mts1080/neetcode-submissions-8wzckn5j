class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num,0)+1);
        }

        int[] result = new int[k];
        for (int x = 0; x < k; x++) {
            int temp = 0;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                temp = Math.max(temp, entry.getValue());
                if (temp == entry.getValue()) {
                    result[x] = entry.getKey();
                }
            }
            map.remove(result[x]);
        }

        return result;
    }
}
