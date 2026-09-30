class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        int[][] position = {
            {3, 1},
            {0, 0},
            {0, 1},
            {0, 2},
            {1, 0},
            {1, 1},
            {1, 2},
            {2, 0},
            {2, 1}, 
            {2, 2}
        };
        
        int leftR = 3;
        int leftC = 0;
        int rightR = 3;
        int rightC = 2;
        
        for (int i : numbers) {
            if (i == 1 || i == 4 || i == 7) {
                sb.append('L');
                leftR = position[i][0];
                leftC = position[i][1];
                
            } else if (i == 3 || i == 6 || i == 9) {
                sb.append('R');
                rightR = position[i][0];
                rightC = position[i][1];
            } else {
                int leftDistance = Math.abs(position[i][0] - leftR) +
                    Math.abs(position[i][1] - leftC);
                int rightDistance = Math.abs(position[i][0] - rightR) +
                    Math.abs(position[i][1] - rightC);
                
                if (leftDistance == rightDistance) {
                    if (hand.equals("right")) {
                        sb.append('R');
                        rightR = position[i][0];
                        rightC = position[i][1];
                    } else {
                        sb.append('L');
                        leftR = position[i][0];
                        leftC = position[i][1];
                    }
                } else if (leftDistance < rightDistance) {
                    sb.append('L');
                    leftR = position[i][0];
                    leftC = position[i][1];
                } else {
                    sb.append('R');
                    rightR = position[i][0];
                    rightC = position[i][1];
                }
            }
        }
        
        return sb.toString();
    }
}