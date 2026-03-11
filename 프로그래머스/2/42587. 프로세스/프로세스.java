import java.util.Queue;
import java.util.LinkedList;
import java.util.Arrays;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        int locationInt = location;

        Queue<Integer> que = new LinkedList<Integer>();
        for(int i : priorities){
            que.add(i);
        }

        Arrays.sort(priorities);
        int size = priorities.length - 1;



        while(!que.isEmpty()){
            Integer i = que.poll();
            if(i == priorities[size - answer]){
                answer++;
                locationInt--;
                if(locationInt < 0)
                    break;
            }else{
                que.add(i);
                locationInt--;
                if(locationInt < 0)
                    locationInt = que.size()-1;
            }
        }

        return answer;
    }
}