class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int multiply = 1;
        int sum = 0;
        
        for (int i = 0; i < num_list.length; i++){
            multiply *= num_list[i];
            sum += num_list[i] ;
        }
        
        answer = multiply < sum * sum ? 1 : 0;
        
        return answer;
    }
}