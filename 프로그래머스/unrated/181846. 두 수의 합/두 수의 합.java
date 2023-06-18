import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        String answer = "";
        
        BigInteger bigInteger1 = new BigInteger(a);
        BigInteger bigInteger2 = new BigInteger(b);
        
        answer = String.valueOf(bigInteger1.add(bigInteger2));
        
        
        return answer;
    }
}