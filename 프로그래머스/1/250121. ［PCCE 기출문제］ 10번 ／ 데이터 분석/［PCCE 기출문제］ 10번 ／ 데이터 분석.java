import java.util.List;
import java.util.ArrayList;
class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<String> idx = List.of("code", "date", "maximum", "remain");
        int extIdx = idx.indexOf(ext);
        int sortIdx = idx.indexOf(sort_by);
        
        ArrayList<int[]> arr = new ArrayList<>();
        
        for (int i = 0; i < data.length; i++) {
            if (data[i][extIdx] < val_ext) {
                arr.add(data[i]);
            }
        }
        
        arr.sort((a, b) -> Integer.compare(a[sortIdx], b[sortIdx]));
        
        int[][] answer = new int[arr.size()][4];
        
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(i).length; j++) {
                answer[i][j] = arr.get(i)[j];
            }
            
        }
        
        return answer;
    }
}