
class Solution {
    public int divisorCnt(int n) {
        if (n == 1) return 1;
        int cnt = 2;
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) cnt++;
        }
        return cnt;
    }
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for (int i = 1; i <= number; i++) {
            int temp = divisorCnt(i);
            if (temp > limit) answer += power;
            else answer += temp;
        }
        return answer;
    }
}