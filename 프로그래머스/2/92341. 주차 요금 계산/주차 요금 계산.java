import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        Map<String, Integer> inMap = new HashMap<>();
        Map<String, Integer> totalMap = new HashMap<>();
        
        for (String record : records) {
            String[] parts = record.split(" ");
            
            String[] time = parts[0].split(":");
            int minutes = Integer.parseInt(time[0]) * 60 + Integer.parseInt(time[1]);
            
            String car = parts[1];
            String type = parts[2];
            
            if (type.equals("IN")) {
                inMap.put(car, minutes);
            } else {
                int inTime = inMap.get(car);
                int usedTime = minutes - inTime;
                
                totalMap.put(car, totalMap.getOrDefault(car, 0) + usedTime);
                inMap.remove(car);
            }
        }

        int endTime = 23 * 60 + 59;
        
        for (String car : inMap.keySet()) {
            int inTime = inMap.get(car);
            int usedTime = endTime - inTime;
            
            totalMap.put(car, totalMap.getOrDefault(car, 0) + usedTime);
        }
        
        List<String> cars = new ArrayList<>(totalMap.keySet());
        Collections.sort(cars);

        int[] answer = new int[cars.size()];
        
        for (int i = 0; i < cars.size(); i++) {
            String car = cars.get(i);
            int time = totalMap.get(car);
            
            int fee;
            
            if (time <= fees[0]) {
                fee = fees[1];
            } else {
                int extra = time - fees[0];
                int unit = (extra + fees[2] - 1) / fees[2];
                fee = fees[1] + unit * fees[3];
            }
            
            answer[i] = fee;
        }
        
        return answer;
    }
}