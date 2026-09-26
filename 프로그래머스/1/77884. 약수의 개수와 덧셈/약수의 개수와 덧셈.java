class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int initNum = left;
        int[] numArr = new int[right - left + 1];
        int[] countArr = new int[right - left + 1];
        
        for (int i = 0; i < (right - left + 1); i++){
            numArr[i] = initNum;
            initNum++;
        }
        
        for (int i = 0; i < numArr.length; i++){
            int count = 0;
            for (int j = 1; j <=numArr[i]; j++) {
                if (numArr[i] % j == 0){
                    count++;
                }
            }
            countArr[i] = count;
        }
        
        for (int i = 0; i < countArr.length; i++){
            if (countArr[i] % 2 == 0){
                answer += numArr[i];
            } else {
                answer -= numArr[i];
            }
        }     
        
        return answer;
    }
}