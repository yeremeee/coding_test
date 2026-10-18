import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int[][] answer = {};
        
        int extIndex = -1;
        
        switch (ext) {
            case "code" :
                extIndex = 0;
                break;
                
            case "date" :
                extIndex = 1;
                break;
            
            case "maximum" :
                extIndex = 2;
                break;
                
            case "remain" :
                extIndex = 3;
                break;
        }
        
        int sortIndex = -1;
        
        switch (sort_by) {
                case "code" :
                    sortIndex = 0;
                    break;
                
            case "date" :
                    sortIndex = 1;
                    break;
            
            case "maximum" :
                    sortIndex = 2;
                    break;
                
            case "remain" :
                    sortIndex = 3;
                    break;
        }
        
        final int index = sortIndex;
        
        List<int[]> list = new ArrayList<>();
        
        for (int i = 0; i < data.length; i++) {
            if (data[i][extIndex] < val_ext) {
                list.add(data[i]);
            }
        }
        
        list.sort((a, b) -> Integer.compare(a[index], b[index]));

        return list.toArray(new int[list.size()][]);
    }
}