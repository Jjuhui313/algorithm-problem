class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] arr = my_string.split(" ");
        boolean minusSign = false;
        int number = 0;
        
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].equals("+")) {
                minusSign = false;
            } else if(arr[i].equals("-")) {
                minusSign = true;
            } else {
                number = Integer.parseInt(arr[i]);
            }
            if(minusSign) {
                answer -= number;
            } else {
                answer += number;
            }
            number = 0;
        }
        
        
        return answer;
    }
}