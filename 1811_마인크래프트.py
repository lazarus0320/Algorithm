from math import inf
import sys

N, M, B = map(int, input().split())
ground = [list(map(int, sys.stdin.readline().split())) for _ in range(N)]
tail = 0
ans = inf

for i in range(257):
    max = 0
    min = 0
    for j in range(N):
        for k in range(M):
            if ground[j][k] < i:
                min += (i - ground[j][k])
            
            else:
                max += (ground[j][k] - i)
                
    inven = max + B
    if inven < min:
        continue 
    time = 2 * max + min
    
    if time <= ans:
        ans = time
        tail = i
print(ans, tail)