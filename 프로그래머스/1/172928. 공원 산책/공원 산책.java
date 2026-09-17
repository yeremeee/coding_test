import java.util.*;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] start = new int[2];
        
        int[] end = new int[2];
        end[0] = park.length;
        end[1] = park[0].length();
        
        for (int i = 0; i < park.length; i++){
           if (park[i].contains("S")) {
               start[0] = i;
               start[1] = park[i].indexOf("S");
           }
        }
        
        for (int i = 0; i < routes.length; i++) {
            String[] route = routes[i].split(" ");

            String direction = route[0];
            int distance = Integer.parseInt(route[1]);

            int dr = 0;
            int dc = 0;

            if (direction.equals("E")) {
                dc = 1;
            } else if (direction.equals("W")) {
                dc = -1;
            } else if (direction.equals("S")) {
                dr = 1;
            } else if (direction.equals("N")) {
                dr = -1;
            }
            
            int tempRow = start[0];
            int tempCol = start[1];
            
            boolean possible = true;
            
            for (int j = 0; j < distance; j++) {
                tempRow += dr;
                tempCol += dc;

                if (tempRow >= end[0] || 
                    tempCol >= end[1] || 
                    tempRow < 0 || 
                    tempCol < 0) {
                    possible = false;
                    break;
                }

                if (park[tempRow].charAt(tempCol) == 'X') {
                    possible = false;
                    break;
                }
                
            }
            
            if (possible){
                    start[0] = tempRow;
                    start[1] = tempCol;
                }
        }
        
        return start;
    }
}