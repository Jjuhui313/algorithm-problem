class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = Math.max(sides[0], sides[1]);
        int min = Math.min(sides[0], sides[1]);
        int result1 = max + 1 - (max + 1 - min);
        int result2 = max + min - (max + 1);
        answer = result1 + result2;
        
        return answer;
    }
}