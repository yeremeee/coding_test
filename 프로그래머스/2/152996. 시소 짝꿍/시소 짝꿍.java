class Solution {
    public long solution(int[] weights) {
        long answer = 0;

        int[] count = new int[1001];

        for (int w : weights) {
            count[w]++;
        }

        for (int w = 100; w <= 1000; w++) {

            if (count[w] == 0) {
                continue;
            }

            answer += (long) count[w] * (count[w] - 1) / 2;

            if (w * 3 % 2 == 0) {
                int partner = w * 3 / 2;

                if (partner <= 1000) {
                    answer += (long) count[w] * count[partner];
                }
            }

            if (w * 2 <= 1000) {
                answer += (long) count[w] * count[w * 2];
            }

            if (w * 4 % 3 == 0) {
                int partner = w * 4 / 3;

                if (partner <= 1000) {
                    answer += (long) count[w] * count[partner];
                }
            }
        }

        return answer;
    }
}