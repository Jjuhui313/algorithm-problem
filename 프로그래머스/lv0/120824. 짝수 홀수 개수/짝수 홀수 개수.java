class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int count1 = 0;
        int count2 = 0;
        
        for (int i : num_list) {
            if(i % 2 == 0) {
                answer[0] = ++count1;
            } else if(i % 2 == 1) {
                answer[1] = ++count2;
            }
        }
        
        return answer;
    }
}