class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int value = 1;
        int row = 0;
        int col = 0;
        int de = 0;
        while (n * n >= value) {
            answer[row][col] = value++;
            if (de == 0) {
                if (col ==  n - 1 || answer[row][col + 1] != 0) {
                    de = 1;
                    row++;
                } else {
                    col++;
                }
            } else if (de == 1) {
                if (row ==  n - 1 || answer[row + 1][col] != 0) {
                    de = 2;
                    col--;
                } else {
                    row++;
                }
            } else if (de == 2) {
                if (col == 0 || answer[row][col - 1] != 0) {
                    de = 3;
                    row--;
                } else {
                    col--;
                }
            } else if (de == 3) {
                if (row == 0 || answer[row - 1][col] != 0) {
                    de = 0;
                    col++;
                } else {
                    row--;
                }
            }
        }
        return answer;
    }
}