import java.util.Objects;

class Solution {
    public int solution(String s) {
            int answer = 0;
            String[] stringArr = s.split(" ");
            for (int i = 0; i < stringArr.length ; i++) {
                if (stringArr[i].equals("Z")){
                    if (stringArr[0] == stringArr[i]){
                        continue;
                    }
                    if (Objects.equals(stringArr[i], stringArr[i - 1])){
                        continue;
                    }
                    answer -= Integer.parseInt(stringArr[i-1]);
                    continue;
                }
                answer += Integer.parseInt(stringArr[i]);
            }
            return answer;
        }
}