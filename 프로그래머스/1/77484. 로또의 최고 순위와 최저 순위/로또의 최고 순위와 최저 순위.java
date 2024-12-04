class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        
        int numberZero = 0;
        int check = 0;
        
        for(int i : lottos) {
            if(i == 0) {
                numberZero++;
            } else {
                for(int j : win_nums) {
                    if(i == j) {
                        check++;
                    }
                }
            }
        }
        
        int max = numberZero + check;
        int min = check;
        
        answer[0] = Math.min(7 - max, 6);
        answer[1] = Math.min(7 - min, 6);
        
        return answer;
    }
}