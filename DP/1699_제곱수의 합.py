import sys;
dp = [0]*100001
N = int(sys.stdin.readline())
dp = [i for i ]

for i in range(1, N+1):
    for j in range(1, i+1):
        if i < j * j:
            break
        dp[i] = min(dp[i], dp[i-j*j]+1)

print(dp[N])
