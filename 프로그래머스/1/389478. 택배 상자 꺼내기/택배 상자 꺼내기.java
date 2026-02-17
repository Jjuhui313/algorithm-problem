class Solution {
    public int solution(int n, int w, int num) {
        int answer = 1;
        
        int row = (num - 1) / w;
        int pos = (num - 1) % w;
        
        int col;
        if (row % 2 == 0) {
            col = pos;
        } else {
            col = w - 1 - pos;
        }
                
        int currentRow = row + 1;
        
        while (true) {
            int boxNumber;
            
            if (currentRow % 2 == 0) {
                boxNumber = currentRow * w + col + 1;
            } else {
                boxNumber = currentRow * w + (w - col);
            }
            
            if (boxNumber > n) break;
            
            answer++;
            currentRow++;
        }
        
        return answer;
    }
}