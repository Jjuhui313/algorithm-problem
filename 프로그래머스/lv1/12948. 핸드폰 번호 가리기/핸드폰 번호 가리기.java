class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int firstLeng = phone_number.length() - 4;
        
        answer += "*".repeat(firstLeng) + phone_number.substring(firstLeng);
        
        return answer;
    }
}