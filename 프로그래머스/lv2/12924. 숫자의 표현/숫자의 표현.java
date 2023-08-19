class Solution {
    public int solution(int n) {
        int answer = 1;
        int sum = 0;
        for (int i = 1; i <= n/2; i++) {
            sum = i;
            for (int j = i+1; sum < n; j++) {
                sum += j;                
            }
            if (sum == n) {
                answer++;
            }
            sum = 0;
        }
        return answer;
    }
}