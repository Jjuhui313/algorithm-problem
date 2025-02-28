import java.util.Arrays;

class Solution {
    public int solution(int[] mats, String[][] park) {
        int answer = -1;

        Arrays.sort(mats);
        for (int i = 0; i < mats.length / 2; i++) {
            int temp = mats[i];
            mats[i] = mats[mats.length - 1 - i];
            mats[mats.length - 1 - i] = temp;
        }


        for (int i : mats) {
            for (int j = 0; j <= park.length - i; j++) {
                for (int h = 0; h <= park[0].length - i; h++) {
                    boolean flag = true;

                    if (park[j][h].equals("-1") && j + i <= park.length && h + i <= park[0].length) {
                        for (int k = 0; k < i; k++) {
                            for (int l = 0; l < i; l++) {
                                if (!park[j + k][h + l].equals("-1")) {
                                    flag = false;
                                    break;
                                }
                            }
                            if (!flag) break;
                        }
                        if (flag) {
                            return i;
                        }
                    }
                }
            }
        }

        return answer;
    }
}