class Solution {
    public String[] solution(String[] strArr) {
        int n = strArr.length;
        String[] answer = new String[n];
        
        for (int i = 0; i < n; i++) {
            String s = strArr[i];
            
            if (i % 2 == 0) {
                answer[i] = s.toLowerCase();
            } else {
                answer[i] = s.toUpperCase();
            }
        }
        
        return answer;
    }
}