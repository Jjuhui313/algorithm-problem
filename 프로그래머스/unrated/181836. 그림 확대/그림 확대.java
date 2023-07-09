class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = "";
        }
        
        for(int i = 0, j = 0; i < picture.length; i++, j += k) {
            for(int h = 0; h < picture[i].length(); h++) {
                char c = picture[i].charAt(h);
                answer[j] += String.valueOf(c).repeat(k);
            }
        }
        
        for(int i = 0; i < answer.length; i++) {
            if(answer[i].equals("")) {
                answer[i] = answer[i - 1];
            }
        }
        
        return answer;
    }
}