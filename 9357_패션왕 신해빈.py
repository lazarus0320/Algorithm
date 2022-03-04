from collections import defaultdict
import sys
from itertools import combinations
T = int(sys.stdin.readline())
for t in range(T):
    clothes = {}
    cnt = 1
    N = int(sys.stdin.readline())
    for n in range(N):
        clothe, kind = sys.stdin.readline().rstrip().split()
        if clothes.get(kind) == None:
            clothes[kind] = set()
        clothes[kind].add(clothe)
        
    for k in clothes.keys():
        cnt *= len(clothes.get(k)) + 1
    print(cnt - 1)