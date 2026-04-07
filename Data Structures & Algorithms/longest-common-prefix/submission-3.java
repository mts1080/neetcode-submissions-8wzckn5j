class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder str = new StringBuilder(strs[0]);

        if (str.length() == 0) {
            return "";
        }
        
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() == 0) {
                return "";
            }

            System.out.println(str.toString());
            if (str.length() > strs[i].length()) {
                str.delete(strs[i].length(), str.length());
            }

            if (str.charAt(0) != strs[i].charAt(0)) {
                return "";
            }

            while (str.charAt(str.length() - 1) != strs[i].charAt(str.length() - 1)) {
                System.out.println(str.toString());
                if (str.length() == 0) {
                    return "";
                }
                str.delete(str.length()-1, str.length());
            }
        }
        return str.toString();
    }
}