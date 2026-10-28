class Solution {
    public long solution(int r1, int r2) {
        long answer = 0;

        for (long x = 1; x <= r2; x++) {
            long outCircle = (long) Math.floor(Math.sqrt((long) r2 * r2 - x * x));
            long inCircle = 1;

            if (x <= r1) {
                inCircle = Math.max(1, (long) Math.ceil(Math.sqrt((long) r1 * r1 - x * x)));
            }

            answer += outCircle - inCircle + 1;
        }

        answer *= 4;
        answer += 4L * (r2 - r1 + 1);

        return answer;
    }
}