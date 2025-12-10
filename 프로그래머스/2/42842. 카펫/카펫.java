class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        /*
            brown + yellow == answer[0] * answer[1]
            brown + yellow = 12 = total
            12 / 2 = 6
            i == 가로
            
        */
        int total = brown + yellow;
        for (int i = 3; i <= total / 2; i++) {
            if (total % i != 0) {
                continue;
            }
            int h = total / i;
            if (h > i) continue;
            
            if((h - 2) * (i - 2) == yellow && (i * 2) + (h - 2) * 2 == brown) {
                answer[0] = i;
                answer[1] = h;
            }
        }
        
        return answer;
    }
}