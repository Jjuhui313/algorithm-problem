import java.util.ArrayList;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        ArrayList<String> arr = new ArrayList<>();

        for (int i = 0; i < want.length; i++) {
            while (number[i]-- > 0) {
                arr.add(want[i]);
            }
        }

        for (int i = 0; i < discount.length - arr.size() + 1;i++) {
            ArrayList<String> list = (ArrayList<String>) arr.clone();
            for (int j = i; j < i + arr.size(); j++) {
                if (list.contains(discount[j])) {
                    list.remove(discount[j]);
                } else {
                    break;
                }
            }
            answer += list.size() == 0 ? 1 : 0;
        }

        return answer;
    }
}