class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
        int multi = 1;
        
        int n = num_list.length;
        
        if (n >= 11) {
            for (int i = 0; i < n; i++) {
                sum += num_list[i];
            }
            return sum;
        } else {
            for (int i = 0; i < n; i++) {
                multi *= num_list[i];
            }
            return multi;
        }
    }
}