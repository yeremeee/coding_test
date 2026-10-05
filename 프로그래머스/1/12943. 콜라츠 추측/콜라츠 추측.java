class Solution {
    public int solution(int num) {
        int answer = -1;
        long n = num;
        int count = 0;
        
        if (n == 1) {
            return 0;
        }
        
        while (count <= 500) {
            if (n % 2 == 0) {
                n /= 2;
                count++;
            } else {
                n = n * 3 + 1;
                count++;
            }
            
            if (n == 1) {
                return count;
            }
        }
        return answer;
    }
}