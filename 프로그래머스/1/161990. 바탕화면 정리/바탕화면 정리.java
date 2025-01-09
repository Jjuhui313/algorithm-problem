class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        int minX = 50;
        int maxX = 0;
        int minY = 50;
        int maxY = 0;
        
        for (int i = 0; i < wallpaper.length; i++) {
            int idxS = wallpaper[i].indexOf('#');
            int idxL = wallpaper[i].lastIndexOf('#');
            if (idxS != -1 && idxL != -1) {
                if (minX > i) {
                    minX = i;
                }
                if (maxX < i) {
                    maxX = i;
                }
                
                if (minY > idxS) {
                    minY = idxS;
                }
                if (maxY < idxL) {
                    maxY = idxL;
                }
            }
        }

        answer[0] = minX;
        answer[1] = minY;
        answer[2] = maxX + 1;
        answer[3] = maxY + 1;
        
        return answer;
    }
}