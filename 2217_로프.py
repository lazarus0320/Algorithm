import sys
input = sys.stdin.readline

N = int(input())
lst = [int(input()) for i in range(N)]
lst.sort(reverse=True)
S = [None]*N
for i in range(1, N+1):
    S[i-1] = lst[i-1] * i

print(max(S))