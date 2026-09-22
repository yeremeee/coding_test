class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        StringBuilder oddSb = new StringBuilder();
        StringBuilder evenSb = new StringBuilder();
        
        for (int i = 0; i < num_list.length; i++){
            if (num_list[i] % 2 == 1) {
                oddSb.append(num_list[i]);
            } else{
                evenSb.append(num_list[i]);
            }
        }
        
        answer = Integer.valueOf(oddSb.toString()) 
            + Integer.valueOf(evenSb.toString());
        
        return answer;
    }
}