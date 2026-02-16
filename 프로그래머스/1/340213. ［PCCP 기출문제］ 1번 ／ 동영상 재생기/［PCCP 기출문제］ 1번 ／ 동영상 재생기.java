class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";
        
        int totalS = toSecond(video_len);
        int posS = toSecond(pos);
        int opStartS = toSecond(op_start);
        int opEndS = toSecond(op_end);
        
        System.out.println(totalS + " " + posS + " "  + opStartS + " " + opEndS);
        
        posS = skipOpening(posS, opStartS, opEndS);
        
        for (String command : commands) {
            if (command.equals("prev")) {
                posS = Math.max(0, posS - 10);
            } else {
                posS = Math.min(totalS, posS + 10);
            }
            posS = skipOpening(posS, opStartS, opEndS);
        }
        answer = String.format("%02d:%02d", posS / 60, posS % 60);
        return answer;
    }
    private int toSecond(String time) {
        String[] timeParts = time.split(":");
        int m = Integer.parseInt(timeParts[0]);
        int s = Integer.parseInt(timeParts[1]);
        
        return m * 60 + s;
    }
    
    private int skipOpening(int posS, int opStartS, int opEndS) {
        if (posS >= opStartS && posS <= opEndS) {
            return opEndS;
        }
        return posS;
    }
}