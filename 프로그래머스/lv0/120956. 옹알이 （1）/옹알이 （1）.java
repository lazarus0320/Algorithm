class Solution {
    public int solution(String[] babbling) {
        String[] sample = {"aya", "ye", "woo", "ma"};
        int answer = 0;
        for (int i = 0; i < babbling.length; i++) {
            for (String s : sample) {
                babbling[i] = babbling[i].replaceAll(s, "0"); 
            }
            babbling[i] = babbling[i].replaceAll("0", "");
            if (babbling[i].equals("")) answer++;
        }
        return answer;
    }
}