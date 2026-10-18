import java.util.*;

class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < attacks.length; i++) {
            map.put(attacks[i][0], attacks[i][1]);
        }
        
        int lastAttak = attacks[attacks.length - 1][0];
        int maxHealth = health;
        int count = 0;
        
        for (int i = 1; i <= lastAttak; i++) {
            
            if (map.containsKey(i)) {
                health -= map.get(i);
                count = 0;
                if (health <= 0) {
                    return -1;
                }
            } else {
                count++;
                health += bandage[1];
                
                if (count == bandage[0]) {
                    health += bandage[2];
                    count = 0;
                }
                
                health = Math.min(health, maxHealth);
            }   
        }
        
        return health;
    }
}