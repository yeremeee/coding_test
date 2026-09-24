import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;

        HashMap<Integer, Integer> part1 = new HashMap<>();
        HashMap<Integer, Integer> part2 = new HashMap<>();

        for (int i = 0; i < topping.length; i++) {
            part2.put(topping[i], part2.getOrDefault(topping[i], 0) + 1);
        }

        for (int i = 0; i < topping.length - 1; i++) {
            part2.put(topping[i], part2.get(topping[i]) - 1);
            
            if (part2.get(topping[i]) == 0){
                part2.remove(topping[i]);
            }
            
            part1.put(topping[i], part1.getOrDefault(topping[i], 0) + 1);
            
            if(part1.size() == part2.size()){
                answer++;
            }
        }

        return answer;
    }
}