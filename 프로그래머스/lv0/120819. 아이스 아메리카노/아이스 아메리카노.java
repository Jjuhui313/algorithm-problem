class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int iceA = 5500;
        
        answer[0] = money / iceA;
        answer[1] = money - answer[0] * iceA;
        
        return answer;
    }
}