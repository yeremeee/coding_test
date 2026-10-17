import java.util.*;

class Solution {
    public int solution(int[] mats, String[][] park) {
        int answer = 0;
        
        Arrays.sort(mats);
        
        for (int m = mats.length - 1; m >= 0; m--) {
            int size = mats[m];
            
            for (int i = 0; i <= park.length - size; i++) {
                for (int j = 0; j <= park[i].length - size; j++) {
                    if (park[i][j].equals("-1")) {
                        boolean check = true;
                        
                        for (int r = i; r < i + size; r++) {
                            for (int c = j; c < j + size; c++) {
                                if (!park[r][c].equals("-1")) {
                                    check = false;
                                }
                            }
                            
                            if (!check) {
                                break;
                            }
                        }
                        
                        if (check) {
                            return size;
                        }
                    }
                }
            }
        }
        
        return -1;
    }
}