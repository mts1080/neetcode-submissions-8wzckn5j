class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap();
        for (int ind = 0; ind < s.length(); ind += 1) {
            map.put(s.charAt(ind), map.getOrDefault(s.charAt(ind), 0) + 1);
            map.put(t.charAt(ind), map.getOrDefault(t.charAt(ind), 0) - 1);
        }

        for (int count : map.values()) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}
