class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] sArr = {"aya", "ye", "woo", "ma"};
        String[] repeatStr = {"ayaaya", "yeye", "woowoo", "mama"};
        
        for (int i = 0; i < babbling.length; i++) {
            for (int j = 0; j < sArr.length; j++) {
                String s = sArr[j] + sArr[j];
                if (!babbling[i].contains(s)) {
                    babbling[i] = babbling[i].replaceAll(repeatStr[j], "1").replaceAll(sArr[j], " ");
                }
            }
            
            if (babbling[i].trim().length() == 0) {
                answer++;
            }
        }
        
        return answer;
    }
}