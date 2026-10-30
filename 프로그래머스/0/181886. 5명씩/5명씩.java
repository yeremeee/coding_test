class Solution {
    public String[] solution(String[] names) {
        int namesLen = names.length;
        int answerLen = (namesLen % 5) == 0 ? namesLen / 5 : namesLen / 5 + 1;
        String[] answer = new String[answerLen];
        
        for (int i = 0; i < names.length; i++) {
            if (i % 5 == 0) {
                answer[i / 5] = names[i];
            }
        }
        
        return answer;
    }
}