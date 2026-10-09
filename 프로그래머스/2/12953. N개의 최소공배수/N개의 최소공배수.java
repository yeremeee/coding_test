class Solution {
    public int solution(int[] arr) {
        int result = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            int gcd = gcd(result, arr[i]);
            
            result = result * arr[i] / gcd; 
        }
        
        return result;
    }
    
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b; 
            b = a % b;
            a = temp;
        }
        
        return a;
    }
}