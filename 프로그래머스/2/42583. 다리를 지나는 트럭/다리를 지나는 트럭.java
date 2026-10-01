import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> bridge = new LinkedList<>();
        
        int second = 0;
        int bridgeWeight = 0;
        int truckIndex = 0;
        
        for (int i = 0; i < bridge_length; i++) {
             bridge.offer(0);
        }
        
        while (truckIndex < truck_weights.length) {
            second++;

            int out = bridge.poll();

            bridgeWeight -= out;

            if (bridgeWeight + truck_weights[truckIndex] <= weight) {
                bridge.offer(truck_weights[truckIndex]);
                bridgeWeight += truck_weights[truckIndex];
                truckIndex++;
            } else {
                bridge.offer(0);
            }
        }
        
        return second + bridge_length;
    }
}