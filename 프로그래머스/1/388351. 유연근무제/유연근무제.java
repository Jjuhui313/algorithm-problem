class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        int n = schedules.length;
        
        for (int i = 0; i < n; i++) {
            int limitTime = addTenMinutes(schedules[i]);
            boolean isValid = true;
            
            for (int day = 0; day < 7; day++) {
                int currentDay = (startday + day - 1) % 7 + 1; 
                
                if (currentDay == 6 || currentDay == 7) continue;
                
                if (timelogs[i][day] > limitTime) {
                    isValid = false;
                    break;
                }
            }
            
            if (isValid) answer++;
        }
        
        return answer;
    }
    
    private int addTenMinutes(int time) {
        int hour = time / 100;
        int minute = time % 100;
        
        minute += 10;
        
        if (minute >= 60) {
            hour++;
            minute -= 60;
        }
        
        return hour * 100 + minute;
    }
}