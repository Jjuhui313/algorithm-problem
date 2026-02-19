import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

class Solution {
    public int[] solution(String s) {
        s = s.substring(2, s.length() - 2);
        
        String[] sets = s.split("\\},\\{");
        Arrays.sort(sets, (a, b) -> a.length() - b.length());
        Set<Integer> seen = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        for (String set : sets) {
            String[] numbers = set.split(",");
            
            for (String num : numbers) {
                int value = Integer.parseInt(num);
                if (!seen.contains(value)) {
                    seen.add(value);
                    result.add(value);
                }
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}