class Solution {
    public int evalRPN(String[] tokens) {
        LinkedList<Integer> list = new LinkedList<>();

        for (String s : tokens) {
            if (s.matches("-?\\d+")) {
                list.addLast(Integer.parseInt(s));
            } else if (s.equals("+")) {
                int num1 = list.removeLast();
                int num2 = list.removeLast();
                list.addLast(num1 + num2);
            } else if (s.equals("-")) {
                int num1 = list.removeLast();
                int num2 = list.removeLast();
                list.addLast(num2 - num1);
            } else if (s.equals("*")) {
                int num1 = list.removeLast();
                int num2 = list.removeLast();
                list.addLast(num1 * num2);
            } else if (s.equals("/")) {
                int num1 = list.removeLast();
                int num2 = list.removeLast();
                list.addLast(num2 / num1);
            }
        }

        return list.getLast();
    }
}
