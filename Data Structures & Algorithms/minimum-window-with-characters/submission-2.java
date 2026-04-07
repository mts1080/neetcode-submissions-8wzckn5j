class Solution {
    public String minWindow(String s, String t) {
        if (t.length() > s.length()) {
            return "";
        }

        if (t.length() == 1 && s.length()==1) {
            if (t.equals(s)) {
                return s;
            } else {
                return "";
            }
        }

        HashMap<Character, Integer> smap = new HashMap<>();
        HashMap<Character, Integer> tmap = new HashMap<>();
        String temp = "";
        int shortest = 10000;

        for (int x = 0; x < t.length(); x ++) {
            tmap.put(t.charAt(x), tmap.getOrDefault(t.charAt(x),0)+1);
        }

        for (int lw = 0; lw < s.length(); lw++) {
            if (tmap.containsKey(s.charAt(lw))) {
                smap.put(s.charAt(lw), 1);
                if (smap.equals(tmap)) {
                    return t;
                }
                for (int rw = lw+1; rw < s.length(); rw++) {
                    if (tmap.containsKey(s.charAt(rw))) {
                        if (tmap.get(s.charAt(rw)) >= smap.getOrDefault(s.charAt(rw),0)+1) {
                            smap.put(s.charAt(rw), smap.getOrDefault(s.charAt(rw),0)+1);
                        }
                    }
                    if (smap.equals(tmap)) {
                        if (shortest > rw-lw+1) {
                            shortest = rw-lw+1;
                            if (rw == s.length()-1) {
                                temp = s.substring(lw);
                            } else {
                                temp = s.substring(lw, rw+1);
                            }
                        }
                        break;
                    }
                }
                smap.clear();
            }
        }
        return temp;
    }
}
