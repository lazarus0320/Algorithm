class Solution {
    public int solution(String[] babbling) {
        String[] canSpeakArr = {"aya", "ye", "woo", "ma"};
        int answer = 0;

        for (String bab: babbling) {
            String prev = "";
            boolean isValid = true;

            while (!bab.isEmpty()) {
                boolean found = false;

                for (String now : canSpeakArr) {
                    if (bab.startsWith(now) && !now.equals(prev)) {  // 발음이 앞부분에 있고, 연속된 발음이 아니면
                        bab = bab.substring(now.length());
                        prev = now;
                        found = true;
                        break;
                    }
                }

                if (!found) {  // 유효한 발음을 찾지 못하면
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                answer++;
            }
        }

        return answer;
    }
}
