import sys; input = sys.stdin.readline
from itertools import accumulate
N, M = map(int, input().split())
lst = list(map(int, input().split()))
nlst = list(accumulate(lst))
ans = []
for _ in range(M):
    i, j = map(int, input().split())
    if i <= 1:
        print(nlst[j-1])
    else:
        print(nlst[j-1] - nlst[i-2])
    
