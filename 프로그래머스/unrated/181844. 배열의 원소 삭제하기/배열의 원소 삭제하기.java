import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> array = new ArrayList<>();
        for(int i : arr) {
            array.add(i);
        }
        
        for(int i = 0; i < array.size(); i++) {
            for(int j = 0; j < delete_list.length; j++) {
                if(array.get(i) == delete_list[j]) {
                    array.remove(i);
                    i--;
                    break;
                }
            }
        }
        
        int[] answer = new int[array.size()];
        for (int i = 0; i < array.size(); i++) {
            answer[i] = array.get(i);
        }
        
        return answer;
    }
}