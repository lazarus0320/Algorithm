import sys
N, K = map(int, sys.stdin.readline().split())
lst = [int(sys.stdin.readline()) for _ in range(N)]
cnt = 0
for i in range(N)[::-1]:
    if lst[i] > K:
        continue
    cnt += K // lst[i]
    K %= lst[i]
    if K == 0:
        break
print(cnt)