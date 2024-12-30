class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[(arr.length == 1) ? 1 : arr.length - 1];
        boolean isEmpty = true;
        
        int temp = arr[0];
        
        for(int i : arr) {
            if(i < temp) {
                temp = i;
            }
        }
        
        int index = 0;
        for(int i : arr) {
            if(temp != i) {
                answer[index] = i;
                index++;
                isEmpty = false;
            }
        }
        if(isEmpty) {
            answer[0] = -1;
        }
        
        return answer;
    }
}