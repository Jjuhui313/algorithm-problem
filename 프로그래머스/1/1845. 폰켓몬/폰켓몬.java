import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int numsHalf = nums.length/2;
        HashSet<Integer> hash = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++) {
            hash.add(nums[i]);
        }
        if(numsHalf < hash.size()) {
            answer = numsHalf;
        } else {
            answer = hash.size();
        }
        return answer;
        
        
    }
}