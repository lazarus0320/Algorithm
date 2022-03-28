import sys; input = sys.stdin.readline
T = int(input())
for _ in range(T):
    N = int(input())
    dp = [1] * 101
    for i in range(4, N+1):
        dp[i] = dp[i-3] + dp[i-2]
    print(dp[i])
