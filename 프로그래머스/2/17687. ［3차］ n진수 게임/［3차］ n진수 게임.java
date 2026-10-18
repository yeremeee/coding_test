class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
        StringBuilder result = new StringBuilder();
        
        int num = 0;
        
        while (sb.length() < t * m) {
            sb.append(Integer.toString(num, n).toUpperCase());
            num++;
        }
        
        for (int i = 0; i < t; i++) {
            int index = (p - 1) + i * m;
            result.append(sb.charAt(index));
        }
        return result.toString();
    }
}