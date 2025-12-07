import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int n : people)
            arr.add(n);
        Collections.sort(arr);

        int left=0;
        int right = arr.size()-1;

        while(left <= right){ 
            if(arr.get(left) + arr.get(right)<=limit)
                left++;
            right--;
            answer++;
        }

        return answer;
    }
}