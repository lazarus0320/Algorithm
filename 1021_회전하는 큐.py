import sys
from collections import deque
input = sys.stdin.readline
N, M = map(int, input().split())
lst = list(map(int, input().split()))
dq = deque()
for l in lst:
    for i in range(N):
        if l-1 == i-1:
            dq[i] = l
        else:
            dq[i] = None
print(dq)