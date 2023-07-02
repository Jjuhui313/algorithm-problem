class Solution {
    public int[] solution(int[] arr) {
        
        int a = 1;
        while(a < 1000) {
            
            if(arr.length <= a) {
                break;
            }
            a *= 2;
        }

        int[] answer = new int[a];
        for(int i = 0; i < a; i++) {
            if(arr.length <= i) {
                answer[i] = 0;
            } else {
                answer[i] = arr[i];
            }
            
        }
        
        return answer;
    }
}