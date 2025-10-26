class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        
        String move = A;
        for (int i = 0; i < A.length(); i++) {
            if (move.equals(B)) return answer;
            
            String s = move.substring(A.length() - 1);
            move = s + move.substring(0, A.length() - 1);
            answer++;
        }
        
        
        return -1;
    }
}