import java.util.Arrays;
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] subAnswer1 = new String[n];
        String[] subAnswer2 = new String[n];
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = "";
        }
        
        for(int i = 0; i < arr1.length; i++) {
            String s = Integer.toBinaryString(arr1[i]);
            subAnswer1[i] = s.length() < n ? "0".repeat(n - s.length()) + s : s;
            subAnswer1[i] = subAnswer1[i].replaceAll("1", "#");
            subAnswer1[i] = subAnswer1[i].replaceAll("0", "=");
        }
        
        for(int i = 0; i < arr2.length; i++) {
            String s = Integer.toBinaryString(arr2[i]);
            subAnswer2[i] = s.length() < n ? "0".repeat(n - s.length()) + s : s;
            subAnswer2[i] = subAnswer2[i].replaceAll("1", "#");
            subAnswer2[i] = subAnswer2[i].replaceAll("0", "=");
        }
        
        for(int i = 0; i < subAnswer1.length; i++) {
            for(int j = 0; j < subAnswer1[i].length(); j++) {
                char c1 = subAnswer1[i].charAt(j);
                char c2 = subAnswer2[i].charAt(j);
                if(String.valueOf(c1).equals("#") || String.valueOf(c2).equals("#")) {
                    answer[i] += "#";
                } else {
                    answer[i] += " ";
                }
            }
        }
        
        
        
        return answer;
    }
}