import java.util.Arrays;
class Solution {
    public int solution(String[] s1, String[] s2) {
        int cnt = 0;
        for (String s: s1) {
            if (Arrays.stream(s2).anyMatch(s :: equals)) cnt++;
        }
        return cnt;
    }
}