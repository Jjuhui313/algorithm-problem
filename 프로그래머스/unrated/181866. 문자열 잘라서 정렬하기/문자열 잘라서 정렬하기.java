import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
class Solution {
    public String[] solution(String myString) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (char c : myString.toCharArray()) {
            if (c == 'x') {
                if (sb.length() > 0) {
                    list.add(sb.toString());
                    sb.setLength(0);
                }
            } else {
                sb.append(c);
            }
        }

        if (sb.length() > 0) {
            list.add(sb.toString());
        }

        List<String> sortedList = new ArrayList<>(list);
        sortedList.removeIf(x -> x.equals(""));
        Collections.sort(sortedList);

        String[] answer = new String[sortedList.size()];
        sortedList.toArray(answer);
        
        return answer;
    }
}