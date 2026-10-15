import java.util.*;

class Solution {
    public int solution(int n, int w, int num) {
        int answer = 0;
        int f = (n % w == 0) ? (n / w) : (n / w + 1);
        int[][] boxes = new int[f][w];
        boolean goRight = true;
        int boxNum = 1;
        int currentFloor = 0;
        
        while (boxNum <= n) {
            int[] floorBoxes = new int[w];
            
            if (goRight) {
                for (int j = 0; j < w && boxNum <= n; j++) {
                    floorBoxes[j] = boxNum;
                    boxNum++;
                }
                
                goRight = false;
                boxes[currentFloor] = floorBoxes;
                currentFloor++;
                
            } else {
                for (int j = w - 1; j >= 0 && boxNum <= n; j--) {
                    floorBoxes[j] = boxNum;
                    boxNum++;
                }
                
                goRight = true;
                boxes[currentFloor] = floorBoxes;
                currentFloor++;
            }
        }
        
        int targetFloor = -1;
        int targetIndex = -1;
        for (int i = 0; i < boxes.length; i++) {
            for (int j = 0; j < boxes[i].length; j++) {
                if (boxes[i][j] == num) {
                    targetFloor = i;
                    targetIndex = j;
                }
            }
                
        }
        
        for (int i = boxes.length - 1; i >= targetFloor; i--) {
            if (boxes[i][targetIndex] != 0) {
                    answer++;
            }
        }
       
        return answer;
    }
}