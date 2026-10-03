class Solution {
    public int solution(int[] citations) {
        int h = 0;
        int max = 0;
        
        for (int i = 0; i < citations.length; i++) {
            max = Math.max(max, citations[i]);
        }
        
        for (int i = 0; i <= max; i++) {
            int count = 0;
            
            for (int j = 0; j < citations.length; j++) {
                if (citations[j] >= i) {
                    count++;
                }
            }
            
            if (count >= i) {
                h = i;
            }
        }
        
        return h;
    }
}