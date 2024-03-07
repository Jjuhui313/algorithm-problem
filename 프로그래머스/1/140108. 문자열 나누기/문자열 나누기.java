class Solution {
    public int solution(String s) {
        int answer = 0;
        int countOne = 0;
        int countTwo = 0;
        
        char[] arr = new char[2];
        
        arr[0] = '0';
        int i = 0;
        while (i < s.length()) {
            char c = s.charAt(i);
            
            if (arr[0] == '0') {
                arr[0] = c;
            }
            
            if (arr[0] == c) {
                countOne++;
            } else {
                countTwo++;
            }
            
            if (countOne == countTwo) {
                answer++;
                countOne = 0;
                countTwo = 0;
                arr[0] = '0';
                arr[1] = '0';
                
            }
            
            if (i == s.length() - 1 && (countOne != 0 || countTwo != 0)) {
                answer++;
            }
            
            i++;
        }
        
        return answer;
    }
}