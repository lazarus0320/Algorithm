from collections import deque
import sys

N = int(sys.stdin.readline())
for _ in range(N):
    word = deque(sys.stdin.readline().rstrip())
    dq = deque()
    if word[0] == ')' or word[-1] == '(':
        print('NO')
        continue
    p = word.pop()
    dq.append(p)
    while len(word) > 0:
        p = word.pop()
        if len(dq) == 0:
            dq.append(p)
        elif p != dq[-1] and dq[-1] == ')':
            dq.pop()
        else:
            dq.append(p)
    if len(dq) > 0:
        print('NO')
    else:
        print('YES')