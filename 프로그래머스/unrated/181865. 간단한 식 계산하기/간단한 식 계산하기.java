class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] arr = binomial.split(" ");
        
        int n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[2]);
        String op = arr[1];
        
        switch(op) {
            case "+":
                answer = n + m;
                break;
            case "-":
                answer = n - m;
                break;
            case "*":
                answer = n * m;
        }
        
        return answer;
    }
}