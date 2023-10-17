class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i = 0; i < quiz.length; i++) {
            String[] sArr = quiz[i].split(" ");
            
            if(sArr[1].equals("-")) {
                if(Integer.parseInt(sArr[0]) - Integer.parseInt(sArr[2]) == Integer.parseInt(sArr[4])) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            } else {
                if(Integer.parseInt(sArr[0]) + Integer.parseInt(sArr[2]) == Integer.parseInt(sArr[4])) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            }
            
        }
        
        return answer;
    }
}