class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        int gdc = 1;
        int molecule = 0;
        int denominator = 0;
        int factor = 0;
        
        for(int i = 1; i <= min / 2; i++) {
            if(min % i == 0 && max % i == 0) {
                gdc = i;
            }
        }
        
        if(max % min == 0) {
            gdc = min;
        }
        
        denominator = b / gdc;
        
        if(denominator == 1) {
            return 1;
        }

        int k = 2;
        while(denominator > 1) {
            if(denominator % k == 0) {
                denominator /= k;
                factor = k;
                if(factor != 2 && factor != 5) {
                    answer = 2;
                    break;
                } else {
                    answer = 1;
                }
            } else {
                k++;
            }
        }
        
        return answer;
    }
}