import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        
        switch (n) {
            case 1 :
                return Arrays.copyOfRange(num_list, 0, slicer[1] + 1);
            
            case 2 :
                return Arrays.copyOfRange(num_list, slicer[0], num_list.length);
                
            case 3 :
                return Arrays.copyOfRange(num_list, slicer[0], slicer[1] + 1);
            
            case 4 :
                int a = slicer[0];
                int b = slicer[1];
                int c = slicer[2];

                int size = (b - a) / c + 1;
                int[] result = new int[size];

                int index = 0;

                for (int i = a; i <= b; i += c) {
                    result[index++] = num_list[i];
                }

                return result;
        }
        return answer;
    }
}