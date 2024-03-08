import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] arr = new int[n];

        Arrays.fill(arr, 1);

        for (int r : reserve) {
            arr[r - 1]++;
        }

        for (int l : lost) {
            arr[l - 1]--;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                if (i - 1 >= 0 && arr[i - 1] == 2) {
                    arr[i - 1]--;
                    arr[i]++;
                } else if (i + 1 < arr.length && arr[i + 1] == 2) {
                    arr[i + 1]--;
                    arr[i]++;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                answer++;
            }
        }

        return answer;
    }
}
