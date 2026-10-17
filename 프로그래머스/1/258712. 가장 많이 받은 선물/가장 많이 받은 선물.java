import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        Map<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < friends.length; i++) {
            map.put(friends[i], i);
        }
        
        int n = friends.length;
        int[][] count = new int[n][n];
        int[] score = new int[n];
        
        for (String s : gifts) {
            int from = map.get(s.split(" ")[0]);
            int to = map.get(s.split(" ")[1]);
            
            count[from][to]++;
            score[from]++;
            score[to]--;
        }
        
        int[] nextGift = new int[n];
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (count[i][j] > count[j][i]){
                    nextGift[i]++;
                } else if (count[i][j] < count[j][i]) {
                    nextGift[j]++;
                } else {
                    if (score[i] > score[j]) {
                        nextGift[i]++;
                    } else if (score[i] < score[j]) {
                        nextGift[j]++;
                    }
                }
            }
        }
        
        int max = 0;
        
        for (int i : nextGift) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }
}