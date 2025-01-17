class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;
        
        int nowHp = health; //현재 체력
        int continuous = 0; //연속 성공
        
        int time = bandage[0]; // 시전 시간
        int amount = bandage[1]; //초당 회복량
        int addition = bandage[2]; //추가 회복량
        
        int sTime = 1;
        
        for (int i = 0; i < attacks.length; i++) {
            int attackSecond = attacks[i][0];
            int attackDamage = attacks[i][1];
            
            for (int j = sTime; j < attackSecond; j++) {
                continuous++;
                nowHp += amount;
                
                if (continuous == time) {
                    nowHp += addition;
                    continuous = 0;
                }
                if (nowHp > health) {
                    nowHp = health;
                    continuous = 0;
                }
            }
            
            nowHp -= attackDamage;
            continuous = 0;
            sTime = attackSecond + 1;
            if (nowHp < 1) {
                return -1;
            }
        }
        
        answer = nowHp;
        return answer;
    }
}