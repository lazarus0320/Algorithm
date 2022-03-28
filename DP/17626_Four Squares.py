import sys;
N = int(sys.stdin.readline())
dp = [0] * (N+1)
dp[1] = 1

for i in range(2, N+1):
    if int(i ** 0.5) == i ** 0.5:
        dp[i] = 1
        continue

    j = 1
    min_ = 1e9
    while (j**2) <= i:
        min_ = min(min_, dp[i - (j**2)])
        dp[i] = min_ + 1
        j += 1

    
print(dp[N])
