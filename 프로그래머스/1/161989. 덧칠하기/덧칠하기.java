class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int lastSection = section[0] + m - 1;
        answer++;

        for (int i = 0; i < section.length; i++) {

            if (section[i] > lastSection) {
                answer++;
                lastSection = section[i] + m - 1;
            }
        }
        
        return answer;
    }
}