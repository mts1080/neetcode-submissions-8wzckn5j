class Solution {
    public boolean isValid(String s) {
        LinkedList<Character> list = new LinkedList<>();
        if (s.length()%2==1) {
            return false;
        }

        for (int x = 0; x < s.length(); x++) {
            Character y = s.charAt(x);
            if (y == '[') {
                list.addLast(y);
            } else if (y == '{') {
                list.addLast(y);
            } else if (y == '(') {
                list.addLast(y);
            } else if (y == ']') {
                if (list.size() == 0) {
                    return false;
                }
                if (list.getLast() != '[') {
                    return false;
                }
                list.removeLast();
            } else if (y == '}') {
                if (list.size() == 0) {
                    return false;
                }
                if (list.getLast() != '{') {
                    return false;
                }
                list.removeLast();
            } else if (y == ')') {
                if (list.size() == 0) {
                    return false;
                }
                if (list.getLast() != '(') {
                    return false;
                }
                list.removeLast();
            }
        }
        return list.size() == 0;
    }
}
