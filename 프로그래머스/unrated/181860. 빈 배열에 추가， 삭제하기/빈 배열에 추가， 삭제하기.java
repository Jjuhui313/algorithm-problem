import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        ArrayList<Integer> intArr = new ArrayList<>();
        for(int i = 0; i < flag.length; i++) {
            if(flag[i]) {
                int num = arr[i] * 2;
                while(num > 0) {
                    intArr.add(arr[i]);
                    num--;
                }
            } else {
                int num = arr[i];
                while(num > 0) {
                    intArr.remove(intArr.size() - 1);
                    num--;
                }
            }
            
        }
        int[] answer = new int[intArr.size()];
        int index = 0;
        for(int i : intArr) {
            answer[index++] = i;
        }
        
        return answer;
    }
}