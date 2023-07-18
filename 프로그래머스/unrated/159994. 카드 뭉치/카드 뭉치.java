import java.util.ArrayList;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        int idx1 = 0;
        int idx2 = 0;
        
        ArrayList<String> cardsArr1 = new ArrayList<>();
        ArrayList<String> cardsArr2 = new ArrayList<>();
        
        for(String i : cards1) {
            cardsArr1.add(i);
        }
        for(String i : cards2) {
            cardsArr2.add(i);
        }
        
        for(int i = 0; i < goal.length; i++) {
            if(cardsArr1.contains(goal[i])) {
                if(idx1 == cardsArr1.indexOf(goal[i]) || idx1 + 1 == cardsArr1.indexOf(goal[i])) {
                    idx1 = cardsArr1.indexOf(goal[i]);
                    answer = "Yes";
                } else {
                    answer = "No";
                    break;
                }
            } else if(cardsArr2.contains(goal[i])) {
                if(idx2 == cardsArr2.indexOf(goal[i]) || idx2 + 1 == cardsArr2.indexOf(goal[i])) {
                    idx2 = cardsArr2.indexOf(goal[i]);
                    answer = "Yes";
                } else {
                    answer = "No";
                    break;
                }
            }
        }
        
        return answer;
    }
}