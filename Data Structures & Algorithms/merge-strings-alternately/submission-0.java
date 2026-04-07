class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int w1len = word1.length();
        int w2len = word2.length();

        if (w1len < w2len) {
            for (int i = 0; i < w1len; i++) {
                sb.append(word1.charAt(i));
                sb.append(word2.charAt(i));
            }
            sb.append(word2.substring(w1len));
        } else if (w2len < w1len) {
            for (int i = 0; i < w2len; i++) {
                sb.append(word1.charAt(i));
                sb.append(word2.charAt(i));
            }
            sb.append(word1.substring(w2len));
        } else {
            for (int i = 0; i < w1len; i++) {
                sb.append(word1.charAt(i));
                sb.append(word2.charAt(i));
            }
        }
        return sb.toString();
    }
}