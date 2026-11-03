class Solution {
    public int[] solution(long begin, long end) {
        int[] answer = new int[(int) (end - begin + 1)];
        
        for (long num = begin; num <= end; num++) {
            answer[(int) (num - begin)] = getBlock(num);
        }
        
        return answer;
    }
    
    private int getBlock(long num) {
        if (num == 1) {
            return 0;
        }
        
        int max = 1;
        
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                long divisor = num / i;
                
                if (divisor <= 10000000) {
                    return (int) divisor;
                }
                
                max = (int) i;
            }
        }
        
        return max;
    }
}