import java.util.*;
class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        Divisor divisorItem = new Divisor();

        for(int i = left; i <= right; i++) {
            if(divisorItem.divisor(i).length % 2 ==0) {
                answer += i;
            } else {
                answer -= i;
            }

        }

        return answer;
    }
}

class Divisor {
    public int[] divisor(int num) {
        ArrayList<Integer> divisorNum = new ArrayList<>();

        for(int i = 1; i <= num / 2; i++) {
            if(num % i == 0) {
                divisorNum.add(i);
            }
        }
        divisorNum.add(num);

        int[] divisorArr = new int[divisorNum.size()];
        for(int i = 0; i < divisorNum.size(); i++) {
            divisorArr[i] = divisorNum.get(i);
        }
        return divisorArr;
    }
}