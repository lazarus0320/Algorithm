class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] dp = new int[n+1];
        
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = (dp[i-2] + dp[i-1]) % 1234567;
        }
        // dp[2] = dp[0] + dp[1] = 0 + 1 = 1;
        // dp[3] = dp[1] + dp[2] = 1 + 1 = 2;
        // dp[4] = dp[2] + dp[3] = 1 + 2 = 3;
        // dp[5] = dp[3] + dp[4] = 2 + 3 = 5;
        // dp[6] = dp[4] + dp[5] = 3 + 5 = 8;
        answer = dp[n];
        return answer;
    }
}