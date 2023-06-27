class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;

        for(int h = i; h <= j; h++) {
            String[] sArr = String.valueOf(h).split("");
            
            for(int g = 0; g < sArr.length; g++) {
                if(sArr[g].equals(String.valueOf(k))) {
                    answer++;
                }
            }
            
        }
        
        return answer;
    }
}