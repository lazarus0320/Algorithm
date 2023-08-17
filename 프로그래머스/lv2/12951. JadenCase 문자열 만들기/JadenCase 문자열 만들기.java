class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] sArr = s.split(" ");
        String answer = "";
        for (String word : sArr) {
            if (word.length() == 0) {
                sb.append(" ");
                continue;
            }
            String firstLetter = word.substring(0, 1).toUpperCase();
            String remainingLetters = word.substring(1).toLowerCase();
            sb.append(firstLetter).append(remainingLetters).append(" ");
        }
        answer = sb.toString();
        if (s.charAt(s.length()-1) != ' ') {
            answer = answer.trim();
        }

        return answer;
    }
}