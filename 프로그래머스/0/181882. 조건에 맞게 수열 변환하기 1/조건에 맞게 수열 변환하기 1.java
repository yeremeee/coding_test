class Solution {
    public int[] solution(int[] arr) {
        int n = arr.length;
        int[] answer = new int[n];
        
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            
            if (num >= 50 &&
               num % 2 == 0) {
                answer[i] = num / 2;
            } else if (num < 50 &&
                      num % 2 == 1) {
                answer[i] = num * 2;
            } else {
                answer[i] = num;
            }
        }
        
        return answer;
    }
}