class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        answer[0] = -1;
        
        for(int i = 1; i < s.length(); i++) {
            String sSub = s.substring(0, i);
            if(sSub.contains(String.valueOf(s.charAt(i)))) {
                answer[i] = i - sSub.lastIndexOf(String.valueOf(s.charAt(i)));
            } else {
                answer[i] = -1;
            }
        }
        
        return answer;
    }
}