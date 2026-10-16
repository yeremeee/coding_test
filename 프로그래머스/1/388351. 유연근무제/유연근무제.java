class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;

        for (int i = 0; i < timelogs.length; i++) {
            boolean success = true;

            int limit = (schedules[i] / 100) * 60
                      + (schedules[i] % 100) + 10;

            for (int j = 0; j < timelogs[i].length; j++) {

                int dayOfWeek = (startday + j - 1) % 7 + 1;

                if (dayOfWeek == 6 || dayOfWeek == 7) {
                    continue;
                }

                int arrival = (timelogs[i][j] / 100) * 60
                            + (timelogs[i][j] % 100);
                
                if (arrival > limit) {
                    success = false;
                    break;
                }
            }

            if (success) {
                answer++;
            }
        }

        return answer;
    }
}