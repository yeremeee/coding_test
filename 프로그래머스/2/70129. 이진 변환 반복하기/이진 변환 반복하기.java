class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        StringBuilder sb = new StringBuilder(s);
        int zeroCount = 0;
        int binaryCount = 0;
        
        System.out.println(s.length() - s.replace("0", "").length());
        System.out.println(s);
        
        while(!s.equals("1")){
            zeroCount += s.length() - s.replace("0", "").length();
            s = s.replace("0", "");
            s = Integer.toBinaryString(s.length());
            binaryCount++;
        }
        
        answer[0] = binaryCount;
        answer[1] = zeroCount;
        
        return answer;
    }
}