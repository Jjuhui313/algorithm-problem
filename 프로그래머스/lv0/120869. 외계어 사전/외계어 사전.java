class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        
        for(int i = 0; i < dic.length; i++) {
            int count = 0;
            for(int j = 0; j < spell.length; j++) {
                if(dic[i].contains(spell[j])) {
                    count++;
                }
                if(count == spell.length) {
                    return 1;
                }
            }
        }
        
        answer = 2;
        
        return answer;
    }
}