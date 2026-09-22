class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] sounds = {"aya", "ye", "woo", "ma"};

        for (String word : babbling) {
            int index = 0;
            String previous = "";
            boolean valid = true;

            while (index < word.length()) {
                boolean found = false;

                for (String sound : sounds) {
                    if (word.startsWith(sound, index)) {
                        if (sound.equals(previous)) {
                            valid = false;
                            break;
                        }

                        index += sound.length();
                        previous = sound;
                        found = true;
                        break;
                    }
                }

                if (!valid || !found) {
                    valid = false;
                    break;
                }
            }

            if (valid && index == word.length()) {
                answer++;
            }
        }

        return answer;
    }
}