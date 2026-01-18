import java.util.ArrayList;

class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        int low = denom1 * denom2;  //8
        int top = (low / denom1) * numer1 + (low / denom2) * numer2;   // 4 * 1 + 2 * 3 = 4 + 6 = 10
        // 10/8
        ArrayList divisorLow = new ArrayList();
        ArrayList divisorTop = new ArrayList();
        
        for(int i = 1; i <= low / 2; i++) {
            if(low % i == 0) {
                divisorLow.add(i);
            }
        }
        divisorLow.add(low);
        
        for(int i = 1; i <= top / 2; i++) {
            if(top % i == 0) {
                divisorTop.add(i);
            }
        }
        divisorTop.add(top);
        
        int gcd = -1;
        
        for(int itemA : (ArrayList<Integer>)divisorLow) {
            for(int itemB : (ArrayList<Integer>)divisorTop) {
                if (itemA == itemB) {
                    if (gcd < itemA) {
                        gcd = itemA;
                    }
                }
            }
        }
        if(gcd != -1) {
            answer[0] = top / gcd;
            answer[1] = low / gcd;
        }
        
        
        return answer;
    }
}