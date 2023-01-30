import java.util.ArrayList;
class Solution {
    public int[] solution(int[] answers) {
        
        
        int[] math1 = {1, 2, 3, 4, 5};
        int[] math2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] math3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int math1Score = 0;
        int math2Score = 0;
        int math3Score = 0;

        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == math1[i % math1.length]) {
                math1Score++;
            }
        }
        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == math2[i % math2.length]) {
                math2Score++;
            }
        }
        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == math3[i % math3.length]) {
                math3Score++;
            }
        }

        int maxResult = Math.max(math1Score, Math.max(math2Score, math3Score));
        ArrayList<Integer> arr = new ArrayList<>();

        if(maxResult == math1Score) {
            arr.add(1);
        }
        if(maxResult == math2Score) {
            arr.add(2);
        }
        if(maxResult == math3Score) {
            arr.add(3);
        }

        int[] answer = new int[arr.size()];

        for(int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i);
        }

        return answer;
    }
}