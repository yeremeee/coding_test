import java.util.*;

class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        List<Integer> divisors = new ArrayList<>();
        
        for (int i = 1; i <= number; i++){
            int count = 0;
            
            for (int j = 1; j <= i; j++){
                if (i % j == 0){
                    count++;
                }
            }
            
            if (count > limit){
                count = power;
            }
            
            divisors.add(count);
        }
        
        for (Integer i : divisors) {
            System.out.println(i);
        }
        
        answer = divisors.stream()
                  .mapToInt(Integer::intValue)
                  .sum();
        
        return answer;
    }
}