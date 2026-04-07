class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> chars = new HashSet<>();

        int lw = 0;
        int rw = 1;

        if (s.length() < 2) {
            return s.length();
        }

        int longest = 0;
        

        while (lw < s.length() - 1) {
            chars.add(s.charAt(lw));
            while (rw <= s.length() - 1) {
                if (chars.contains(s.charAt(rw))) {
                    break;
                }
                chars.add(s.charAt(rw));
                rw++;
            }

            if (chars.size() > longest) {
                longest = chars.size();
            }

            chars.clear();
            lw++;
            rw = lw+1;
        }

        return longest;
    }
}
