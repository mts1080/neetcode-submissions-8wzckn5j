class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", "");

        int lp = 0;
        int rp = str.length() - 1;

        while (lp < rp) {
            if (Character.toLowerCase(str.charAt(lp)) != Character.toLowerCase(str.charAt(rp))) {
                return false;
            }
            lp++;
            rp--;
        }
        return true;
    }
}
