import java.util.*;

class Solution {
    public double[] solution(int k, int[][] ranges) {
        List<Double> answer = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list.add(k);
        
        while (k != 1) {
            if (k % 2 == 0) {
                k /= 2;
            } else {
                k = k * 3 + 1;
            }
            
            list.add(k);
        }
        
        double[] areas = new double[list.size() - 1];
        
        for (int i = 0; i < list.size() - 1; i++) {
            double area = (list.get(i) + list.get(i+1)) / 2.0;
            areas[i] = area;
        }
        
        for (int i = 0; i < ranges.length; i++) {
            int start = ranges[i][0];
            int end = areas.length + ranges[i][1];
            
            if (start > end) {
                answer.add(-1.0);
                continue;
            }
            
            double areaSum = 0.0;
            
            for (int j = start; j < end; j++) {
                areaSum += areas[j];
            }
            
            answer.add(areaSum);
            
        }
        return answer.stream().mapToDouble(Double::doubleValue).toArray();
    }
}