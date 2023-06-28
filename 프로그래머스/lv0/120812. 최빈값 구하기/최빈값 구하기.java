import java.util.HashMap;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        
        for(int i = 0; i < array.length; i++) {
            if(hm.containsKey(array[i])) {
                hm.put(array[i], hm.get(array[i]) + 1);
            } else {
                hm.put(array[i], 1);
            }
        }
        int max = 0;
        for(int key : hm.keySet()) {
            if(max < hm.get(key)) {
                max = hm.get(key);
                answer = key;
            } else if(max == hm.get(key)) {
                answer = -1;
            }
        }
        
        return answer;
    }
}