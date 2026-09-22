class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;

        StringBuilder sb = new StringBuilder();

        for (int num : ingredient) {
            sb.append(num);

            int len = sb.length();

            if (len >= 4 && sb.substring(len - 4).equals("1231")) {
                sb.delete(len - 4, len);
                answer++;
            }
        }

        return answer;
    }
}