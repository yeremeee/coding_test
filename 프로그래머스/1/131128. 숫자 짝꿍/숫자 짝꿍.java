import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        int[] xCount = new int[10];
        int[] yCount = new int[10];
        int[] common = new int[10];

        for (int i = 0; i < X.length(); i++) {
            int digit = X.charAt(i) - '0';
            xCount[digit]++;
        }
        
        for (int i = 0; i < Y.length(); i++) {
            int digit = Y.charAt(i) - '0';
            yCount[digit]++;
        }
        
        for (int i = 0; i < 10; i++){
            common[i] = Math.min(xCount[i], yCount[i]);
        }
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 9; i > -1; i--){
            for (int j = 0; j < common[i]; j++){
                sb.append(i);
            }
        }
        
        answer = sb.toString();
        
        if (answer.startsWith("0")) {
            answer = "0";
        } else if (answer.length() == 0){
            answer = "-1";
        }
        
        return answer;
    }
}