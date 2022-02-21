import sys
from collections import deque

N = int(sys.stdin.readline())
deq = deque()
for _ in range(N):
    a = int(sys.stdin.readline())
    if a == 0:
        deq.pop()
    else: deq.append(a)
print(sum(deq))
    