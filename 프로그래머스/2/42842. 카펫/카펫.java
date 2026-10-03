class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int sum = brown + yellow;
        
        for (int i = 2; i * i <= sum; i++) {
            if (sum % i == 0) {
                int width =  sum / i;
                int height = i;
                
                if ((width - 2) * (height - 2) == yellow) {
                    answer[0] = width;
                    answer[1] = height;
                    
                    return answer;
                }
            }
        }
        return answer;
    }
}