class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;

        long totalPrice = 0;
        
        for(int i = 1; i <= count; i++){
            totalPrice += price * i;
        }
        
        answer = (totalPrice - money) > 0 ? (totalPrice - money) : 0;
        
        return answer;
    }
}