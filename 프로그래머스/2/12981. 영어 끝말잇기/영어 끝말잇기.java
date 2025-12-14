import java.util.List;
import java.util.ArrayList;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        answer[0] = 0;
        answer[1] = 0;
        
        char[] lastCharArr = new char[words.length];
        char lastChar = words[0].charAt(words[0].length() - 1);
        
        List<String> usedWords = new ArrayList<>();
        
        lastCharArr[0] = lastChar;
        usedWords.add(words[0]);
        for (int i = 1; i < words.length; i++) {
            char firstChar = words[i].charAt(0);
            if (lastCharArr[i - 1] != firstChar || usedWords.contains(words[i])) {
                int index = ((i + 1) % n == 0) ? n : (i + 1) % n;
                int turn = ((i + 1) % n == 0) ? (i + 1) / n : (i + 1) / n + 1;
                answer[0] = index;
                answer[1] = turn;
                return answer;
            }
            lastChar = words[i].charAt(words[i].length() - 1);
            lastCharArr[i] = lastChar;
            usedWords.add(words[i]);
        }

        return answer;
    }
}