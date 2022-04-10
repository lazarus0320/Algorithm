import sys 
n = int(input())
maze = list(map(int, sys.stdin.readline().split()))
dp = [1000] * (n)
dp[0] = 0
for i in range(n):
    for j in range(1, maze[i] + 1): # 점프 범위
        if i + j < n: # 현위치 + 점프한 위치가 n을 벗어나지 않을 경우
            dp[i + j] = min(dp[i]+1, dp[i+j])

if dp[-1] == 1000:
    print(-1)
else:
    print(dp[-1])
