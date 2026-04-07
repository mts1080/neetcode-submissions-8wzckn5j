class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> set = new HashMap<>();

        for (int x = 0; x < s1.length(); x++) {
            set.put(s1.charAt(x), set.getOrDefault(s1.charAt(x),0)+1);
        }

        int loopBound = s1.length();
        for (int x = 0; x < s2.length(); x++) {
            if (set.containsKey(s2.charAt(x))) {
                if (x+loopBound-1 >= s2.length()) {
                    break;
                }
                HashMap<Character, Integer> set2 = new HashMap<>();
                set2.put(s2.charAt(x), set2.getOrDefault(s2.charAt(x),0)+1);
                for (int y = 1; y < loopBound; y++) {
                    if (set.containsKey(s2.charAt(x+y))) {
                        set2.put(s2.charAt(x+y), set2.getOrDefault(s2.charAt(x+y),0)+1);
                    }
                }
                if (set.equals(set2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
