class Solution {
    public int solution(String str) {
        int answer = 0;
        int xCnt = 0, yCnt = 0;
        char hero = ' ';
        boolean isFirst = true;
        for (int i = 0; i < str.length(); i++) {
            if (isFirst) {
                hero = str.charAt(i);
                isFirst = !isFirst;
            }
            
            if (str.charAt(i) == hero) {
                xCnt++;
            }
            else if (str.charAt(i) != hero) {
                yCnt++;
            }
            
            if (xCnt == yCnt) {
                xCnt = 0;
                yCnt = 0;
                isFirst = !isFirst;
                answer++;
            }
            else {
                if (i == str.length() - 1) {
                    answer++;
                }
            }
        }
        return answer;
    }
}