class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = 0;
        
        String binary = Integer.toBinaryString(n);
        
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                count++;
            }
        }
        
        int num = n;
        
        while (answer == 0) {
            num++;
            
            String numBinary = Integer.toBinaryString(num);
            int numCount = 0;
            
            for (int i = 0; i < numBinary.length(); i++) {
                if (numBinary.charAt(i) == '1') {
                    numCount++;
                }
            }
            
            if (count == numCount) {
                answer = num;
                break;
            }
        }
        
        return answer;
    }
}