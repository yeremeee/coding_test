class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        
        int[] arr = new int[7];
        arr[a]++;
        arr[b]++;
        arr[c]++;
        arr[d]++;
        
        int distinct = 0;
        for (int i = 1; i < 7; i++) {
            if (arr[i] > 0) {
                distinct++;
            }
        }
        
        int p = 0;
        int q = 0;
        int r = 0;
        
        if (distinct == 1) {
            return 1111 * a;
        }
        
        if (distinct == 2) {
            for (int i = 1; i < 7; i++) {
                if (arr[i] == 3) {
                    p = i;
                } else if (arr[i] == 1) {
                    q = i;
                }
            }
            
            if (p != 0) {
                return (10 * p + q) * (10 * p + q);
            }
            
            for (int i = 1; i < 7; i++) {
                if (arr[i] == 2) {
                    if (p == 0) {
                        p = i;
                    } else {
                        q = i;
                    }
                }
            }
            
            return (p + q) * Math.abs(p - q);
        }
        
        if (distinct == 3) {
            for (int i = 1; i <= 6; i++) {
                if (arr[i] == 1) {
                    if (q == 0) {
                        q = i;
                    } else {
                        r = i;
                    }
                }
            }

            return q * r;
        }

        return Math.min(Math.min(a, b), Math.min(c, d));
    }
}