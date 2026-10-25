import java.util.*;

class Solution {
    public int solution(int[] picks, String[] minerals) {
        int answer = 0;
        int mineralCount = minerals.length;
        int possibleMinerals = 0;
        
        for (int i : picks) {
            possibleMinerals += 5 * i;
        }
        
        mineralCount = Math.min(mineralCount, possibleMinerals);
        
        int groupCount = (mineralCount % 5 == 0) ? 
            (mineralCount / 5) : (mineralCount / 5 + 1);
 
        String[][] mineralGroups = new String[groupCount][5];
        
        for (int i = 0; i < groupCount; i++) {
            for (int j = 0; j < 5; j++) {
                int index = i * 5 + j;
                
                if (index >= mineralCount) {
                    break;
                }
                
                mineralGroups[i][j] = minerals[i * 5 + j];
            }
        }
        
        int[] figure = new int[groupCount];
        
        for (int i = 0; i < groupCount; i++) {
            int sum = 0;
            
            for (int j = 0; j < 5; j++) {
                String mineral = mineralGroups[i][j];
                
                if (mineral == null) {
                    break;
                }
                
                if (mineral.equals("diamond")) {
                    sum += 25;
                } else if (mineral.equals("iron")) {
                    sum += 5;
                } else if (mineral.equals("stone")) {
                    sum += 1;
                }
            }
            
            figure[i] = sum;
        }
        
        Integer[] order = new Integer[groupCount];
        
        for (int i = 0; i < groupCount; i++) {
            order[i] = i;
        }
        
        Arrays.sort(order, (a, b) ->
                    Integer.compare(figure[b], figure[a]));
        
        for (int i = 0; i < groupCount; i++) {
            int groupIndex = order[i];
            
            int pick = -1;
            
            for (int j = 0; j < 3; j++) {
                if (picks[j] > 0) {
                    pick = j; 
                    picks[j]--;
                    break;
                }
            }
            
            if (pick == -1) {
                break;
            }
            
            for (int k = 0; k < 5; k++) {
                String mineral = mineralGroups[groupIndex][k];
                
                if (mineral == null) {
                    break;
                }
                
                if (pick == 0) {
                    answer++;
                } else if (pick == 1) {
                    if (mineral.equals("diamond")) {
                        answer += 5;
                    } else {
                        answer++;
                    }
                } else if (pick == 2) {
                    if (mineral.equals("diamond")) {
                        answer += 25;
                    } else if (mineral.equals("iron")) {
                        answer += 5;
                    } else {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
}