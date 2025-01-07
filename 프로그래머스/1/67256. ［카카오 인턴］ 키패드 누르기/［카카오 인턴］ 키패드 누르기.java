class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";

        int[][] keypad = {
            {3, 1}, // 0
            {0, 0}, // 1
            {0, 1}, // 2
            {0, 2}, // 3
            {1, 0}, // 4
            {1, 1}, // 5
            {1, 2}, // 6
            {2, 0}, // 7
            {2, 1}, // 8
            {2, 2}  // 9
        };

        int[] leftPosition = {3, 0};  // '*'
        int[] rightPosition = {3, 2}; // '#'

        for (int number : numbers) {
            if (number == 1 || number == 4 || number == 7) {
                answer += "L";
                leftPosition = keypad[number];
            } else if (number == 3 || number == 6 || number == 9) {
                answer += "R";
                rightPosition = keypad[number];
            } else {
                int[] targetPosition = keypad[number];
                
                int leftDistance = Math.abs(leftPosition[0] - targetPosition[0]) 
                                 + Math.abs(leftPosition[1] - targetPosition[1]);
                int rightDistance = Math.abs(rightPosition[0] - targetPosition[0]) 
                                  + Math.abs(rightPosition[1] - targetPosition[1]);

                if (leftDistance < rightDistance || (leftDistance == rightDistance && hand.equals("left"))) {
                    answer += "L";
                    leftPosition = targetPosition;
                } else {
                    answer += "R";
                    rightPosition = targetPosition;
                }
            }
        }

        return answer;
    }
}
