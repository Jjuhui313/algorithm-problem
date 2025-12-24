class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int n = want.length;
        int[] cur = new int[n];

        for (int i = 0; i < 10; i++) {
            int idx = findIndex(want, discount[i]);
            if (idx != -1) cur[idx]++;
        }

        for (int start = 0; start <= discount.length - 10; start++) {
            boolean ok = true;

            for (int i = 0; i < n; i++) {
                if (cur[i] < number[i]) {
                    ok = false;
                    break;
                }
            }

            if (ok) answer++;

            if (start + 10 < discount.length) {
                int outIdx = findIndex(want, discount[start]);
                if (outIdx != -1) cur[outIdx]--;

                int inIdx = findIndex(want, discount[start + 10]);
                if (inIdx != -1) cur[inIdx]++;
            }
        }

        return answer;
    }
    
    private int findIndex(String[] want, String item) {
        for (int i = 0; i < want.length; i++) {
            if (want[i].equals(item)) return i;
        }
        return -1;
    }
}