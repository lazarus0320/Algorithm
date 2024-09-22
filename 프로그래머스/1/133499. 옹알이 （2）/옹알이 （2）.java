class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] canSpeakArr = {"aya", "ye", "woo", "ma"};
        
        for (String bab: babbling) {
            if (bab.contains("ayaaya") || bab.contains("yeye")
               || bab.contains("woowoo") || bab.contains("mama")) {
                continue;
            }
            
            for (String word: canSpeakArr) {
                bab = bab.replace(word, " ");
            }
            bab = bab.replace(" ", "");
            
            if (bab.equals("")) {
                answer++;
            }
        }
        return answer;
    }
}