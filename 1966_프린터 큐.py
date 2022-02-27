import sys
from collections import deque
input = sys.stdin.readline
T = int(input())
for _ in range(T):
    N, M = map(int, input().split())
    lev = deque(map(int, input().split()))
    dq = deque(['B']*N)
    dq[M] = 'A'
    pcnt = 0
    while True:
        maxx = max(lev)
        while lev[0] < maxx:
            p = lev.popleft()
            p1 = dq.popleft()
            lev.append(p)
            dq.append(p1)
            
        
        if lev[0] == maxx:
            lev.popleft()
            a = dq.popleft()
            pcnt += 1
            if a == 'A':
                print(pcnt)
                break
