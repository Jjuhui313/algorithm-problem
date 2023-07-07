import java.util.HashMap;
class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int i = 0; i < strArr.length; i++) {
            hm.put(strArr[i].length(), hm.getOrDefault(strArr[i].length(), 0) + 1);
        }

        for(Integer key : hm.keySet()) {
            if(answer < hm.get(key)) {
                answer = hm.get(key);
            }
        }
        
        return answer;
    }
}