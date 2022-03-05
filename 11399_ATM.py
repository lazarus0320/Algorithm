import sys
input = sys.stdin.readline
N = int(input())
nlst = sorted(list(map(int, input().split())))
S = 0
for i in range(1, N):
    nlst[i] += nlst[i-1]
print(sum(nlst))