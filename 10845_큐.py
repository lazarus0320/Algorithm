from collections import deque

import sys
N = int(sys.stdin.readline())
deq = deque()
for _ in range(N):
    A = sys.stdin.readline().split()
    
    if A[0] == 'push':
        deq.append(A[1])
    elif A[0] == 'pop':
        if len(deq) == 0:
            print(-1)
        else:
            print(deq.popleft())
    elif A[0] == 'size':
        print(len(deq))
    elif A[0] == 'empty':
        if len(deq) == 0:
            print(1)
        else:
            print(0)
    elif A[0] == 'front':
        if len(deq) == 0:
            print(-1)
        else:
            print(deq[0])
    elif A[0] == 'back':
        if len(deq) == 0:
            print(-1)
        else:
            print(deq[-1])