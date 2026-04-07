class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        for (int day = temperatures.length-2; day >= 0; day--) {
            int temp = temperatures[day];
            int count = 1;

            while (day + count < temperatures.length) {
                if (temperatures[day+count] > temp) {
                    result[day] = count;
                    break;
                }
                count++;
            }
        }

        return result;
    }
}
