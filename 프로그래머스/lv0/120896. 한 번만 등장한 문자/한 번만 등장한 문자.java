import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
class Solution {
    public String solution(String s) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        char[] cArr = s.toCharArray();
        for(int i = 0; i < cArr.length; i++) {
            if(hm.containsKey(String.valueOf(cArr[i]))) {
                hm.put(String.valueOf(cArr[i]), hm.get(String.valueOf(cArr[i])) + 1);
            } else {
                hm.put(String.valueOf(cArr[i]), 1);
            }
        }
        
        List<String> keyList = new ArrayList<>(hm.keySet());
        keyList.sort((s1, s2) -> s1.compareTo(s2));
        for (String key : keyList) {
            if(hm.get(key) == 1) {
                answer += key;
            }
	    }
        
        return answer;
    }
}