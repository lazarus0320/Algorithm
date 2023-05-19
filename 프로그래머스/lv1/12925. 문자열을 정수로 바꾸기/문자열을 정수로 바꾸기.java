class Solution {
    public int solution(String s) {
        int answer = 0;
        if (s.charAt(0) == '-') {
            String newS = s.substring(1, s.length());
            answer = (-1) * Integer.parseInt(newS);
        }
        else answer = Integer.parseInt(s);
        return answer;
    }
}