class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 0;
        int mul = 1;
        for(int i : num_list) {
            sum += i;
            mul *= i;
        }
        if(mul < sum * sum) {
            return 1;
        }
        
        return answer;
    }
}