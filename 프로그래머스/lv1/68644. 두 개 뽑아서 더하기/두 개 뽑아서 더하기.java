import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

class Solution {
    public int[] solution(int[] numbers) {
        
        HashSet<Integer> hs = new HashSet<>();
        
        
        for(int i = 0; i < numbers.length; i++) {       
            for(int j = i + 1; j < numbers.length; j++) {   
                hs.add(numbers[i] + numbers[j]);            
            }
        }

        int[] answer = new int[hs.size()];      
        Iterator<Integer> iter = hs.iterator();
        
        int index = 0;                          
        while(iter.hasNext()) {                 
            answer[index] = (int)iter.next();   
            index++;                            
        }
        Arrays.sort(answer);                    
        return answer;
    }
}