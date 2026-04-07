class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int lb = 0;
        int rb = matrix.length-1;
        int row = matrix.length/2;
        int columns = matrix[0].length;
        int prevRow = -1;

        while (!(target >= matrix[row][0] && target <= matrix[row][matrix[row].length-1]) && prevRow != row) {
            prevRow = row;
            if (target > matrix[row][matrix[row].length-1]) {
                lb = row+1;
                row = (lb+rb)/2;
            } else if (target < matrix[row][0]) {
                rb = row-1;
                row = (lb+rb)/2;
            }
        }
        
        int clb = 0;
        int crb = matrix[row].length-1;
        int index = (clb+crb)/2;
        int prevIndex = -1;

        while (prevIndex != index) {
            prevIndex = index;
            if (target > matrix[row][index]) {
                clb = index+1;
                index = (clb+crb)/2;
            } else if (target < matrix[row][index]) {
                crb = index-1;
                index = (clb+crb)/2;
            } else {
                return true;
            }
        }

        return false;
    }
}
