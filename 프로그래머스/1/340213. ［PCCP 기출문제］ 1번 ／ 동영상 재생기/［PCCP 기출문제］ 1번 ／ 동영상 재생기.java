class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";
        
        String[] opStartArr = op_start.split(":");
        int opStartSec = Integer.parseInt(opStartArr[0]) * 60 
                + Integer.parseInt(opStartArr[1]);
        
        String[] opEndArr = op_end.split(":");
        int opEndSec = Integer.parseInt(opEndArr[0]) * 60 
                + Integer.parseInt(opEndArr[1]);
        
        String[] posArr = pos.split(":");
        int second = Integer.parseInt(posArr[0]) * 60 
                + Integer.parseInt(posArr[1]);
        
        String[] videoArr = video_len.split(":");
        int videoSec = Integer.parseInt(videoArr[0]) * 60 
                + Integer.parseInt(videoArr[1]);

        if (second >= opStartSec && second <= opEndSec) {
            second = opEndSec;
        }
        
        for (String s : commands) {
            
            switch (s) {
                case "next" :
                    second = Math.min(second + 10, videoSec);
                    break;
                
                case "prev" :
                    second = Math.max(second - 10, 0);
                    break;
                
                default :
                    break;
            }
            
            if (second >= opStartSec && second <= opEndSec) {
                second = opEndSec;
            }
            
        }
        
        StringBuilder sb = new StringBuilder();
        
        if (String.valueOf(second / 60).length() < 2) {
            sb.append("0" + String.valueOf(second / 60) + ":");
        } else {
            sb.append(String.valueOf(second / 60) + ":");
        }
        
        if (String.valueOf(second % 60).length() < 2) {
            sb.append("0" + String.valueOf(second % 60));
        } else {
            sb.append(String.valueOf(second % 60));
        }
        
        
        
        return sb.toString();
    }
}