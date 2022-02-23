import sys
input = sys.stdin.readline


def bs(x, key, ps, pl):
    while True:
        pc = (ps + pl) // 2
        if ps > pl:
            return 0
        elif x[pc] == key:
            return 1
        elif x[pc] < key:
            ps = pc + 1
        elif x[pc] > key:
            pl = pc - 1
    

N = int(input())
cards = sorted(list(map(int, input().split())))
M = int(input())
candidate = list(map(int, input().split()))
ps = 0
pl = len(cards) - 1
for i in range(M):
    print(bs(cards, candidate[i], ps, pl), end = ' ')
