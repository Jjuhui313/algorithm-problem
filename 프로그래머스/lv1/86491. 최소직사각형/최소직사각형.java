class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        int lMax = 1;
        int sMin = 1;
        
        for(int i = 0; i < sizes.length; i++) {
            int l = Math.max(sizes[i][0], sizes[i][1]);
            int s = Math.min(sizes[i][0], sizes[i][1]);
            
            if(l > lMax) {
                lMax = l;
            }
            if(s > sMin) {
                sMin = s;
            }
        }
        answer = lMax * sMin;
        
        return answer;
    }
}