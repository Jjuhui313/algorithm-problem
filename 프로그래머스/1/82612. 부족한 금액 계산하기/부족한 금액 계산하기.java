class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        
        for(long i = 1; i <= Long.valueOf(count); i++) {
            answer += i * price;
        }
        if(answer > money) {
            answer -= money;
        } else {
            answer = 0;
        }
        

        return answer;
    }
}