class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] word = s.split("");
        int index = 0;
        
        for(int i = 0; i < word.length; i++) {
            index = word[i].contains(" ") ? 0 : index + 1;
            if(index % 2 == 0) {
                answer += word[i].toLowerCase();
            } else {
                answer += word[i].toUpperCase();
            }
        }
        
        return answer;
    }
}