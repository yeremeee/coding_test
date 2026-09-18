import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        for (int i = 0; i < targets.length; i++) {

            int count = 0;

            for (int j = 0; j < targets[i].length(); j++) {

                char targetChar = targets[i].charAt(j);
                int minCount = 101;

                for (int k = 0; k < keymap.length; k++) {

                    int index = keymap[k].indexOf(targetChar);

                    if (index != -1 && minCount > index){
                        minCount = index + 1;
                    }
                }

                if (minCount == 101) {
                    count = -1;
                    break;
                } else {
                    count += minCount;
                }
                
            }

            answer[i] = count;
        }
        
        return answer;
    }
}