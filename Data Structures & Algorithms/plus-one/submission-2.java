class Solution {
    public int[] plusOne(int[] digits) {
        int[] arr = digits;
        int ind = digits.length-1;

        while (ind >= 0) {
            if (arr[ind] < 9 && ind == digits.length - 1) {
                arr[ind] += 1;
                return arr;
            } else {
                if (arr[ind] == 9 && ind == digits.length-1) {
                    arr[ind] = 0;
                    if (digits.length > 1) {
                        arr[ind-1] += 1;
                    }
                    ind--;
                } else if (arr[ind] == 10) {
                    if (ind > 0) {
                        arr[ind] = 0;
                        arr[ind-1] += 1;
                        ind--;
                    } else {
                        arr[ind] = 0;
                    }
                } else {
                    break;
                }
            }
        }
        
        if (arr[0] == 0) {
            arr = new int[digits.length+1];
            arr[0] = 1;
        }
        return arr;
    }
}
