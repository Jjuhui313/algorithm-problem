import java.util.ArrayList;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < intStrs.length; i++) {
            String St = intStrs[i].substring(s, (s + l) > intStrs[i].length() ? intStrs[i].length() : s + l);
            if(Integer.parseInt(St) > k) {
                arr.add(Integer.parseInt(St));
            }
        }
        int[] answer = new int[arr.size()];
        int index = 0;
        for(int i : arr) {
            answer[index++] = i;
        }
        
        return answer;
    }
}