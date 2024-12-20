class Solution {
    public String[] keymap;
    public int[] solution(String[] keymap, String[] targets) {
        this.keymap = keymap;
        int[] answer = new int[targets.length];
        
        for (int i = 0; i < targets.length; i++) {
            int sum = 0;
            
            for (char c : targets[i].toCharArray()) {
                int cnt = count(c + "");
                if (cnt == -1) {
                    sum = -1;
                    break;
                }
                sum += cnt;
            }
            answer[i] = sum;
        }
        return answer;
    }
    
    public int count(String str) {
        int min = 100;
        for (String s : keymap) {
            int index = s.indexOf(str);
            if (index == 0) return 1;
            else if (index == -1) continue;
            else min = Math.min(min, index);
        }
        if (min == 100) return -1;
        else return min + 1;
    }
}