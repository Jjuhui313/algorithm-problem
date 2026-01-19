class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] lineArr = new int[200];
        for (int[] line : lines) {
            for (int j = (line[0] + 100); j < (line[1] + 100); j++) {
                lineArr[j]++;
            }
        }

        
        for (int value : lineArr) {
            if (value > 1) answer++;
        }
        return answer;
    }
}