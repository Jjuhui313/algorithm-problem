class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        
        for(int i = 0; i < numbers.length; i++) {
            if(direction.equals("right")) {
                if(i + 1 == numbers.length) {
                    answer[0] = numbers[i];
                    continue;
                }
                answer[i + 1] = numbers[i];
            } else {
                if(i == 0) {
                    answer[answer.length - 1] = numbers[i];
                    continue;
                }
                answer[i - 1] = numbers[i];
            }
            
        }
        
        return answer;
    }
}