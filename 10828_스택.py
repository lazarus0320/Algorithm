import sys
from collections import deque
N = int(sys.stdin.readline())
deq = deque()
for _ in range(N):
    cmd = sys.stdin.readline().split()
    
    if cmd[0] == 'push':
        deq.append(cmd[1])
    elif cmd[0] == 'pop':
        if len(deq) == 0:
            print(-1)
        else:
            print(deq.pop())
    elif cmd[0] == 'size':
        print(len(deq))
    elif cmd[0] == 'empty':
        if len(deq) == 0:
            print(1)
        else:
            print(0)
    elif cmd[0] == 'top':
        if len(deq) == 0:
            print(-1)
        else:
            print(deq[-1])
        