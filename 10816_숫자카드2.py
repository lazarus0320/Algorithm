from os import remove
import sys

def bin_search(x, key):
    ps = 0
    pl = len(x) - 1
    cnt = 0
    while True:
        pc = (ps + pl) // 2
        if x[pc] == key:
            cnt += 1
            print(x)
            print(f'x[{pc}]')
            print(f'ps = {ps}')
            ps += 1
        elif x[pc] < key:
            ps = pc + 1
        else:
            pl = pc - 1
        if ps > pl:
            break

    return cnt

N = int(sys.stdin.readline())
Nlst = list(map(int, sys.stdin.readline().split()))
Nlst.sort()
M = int(sys.stdin.readline())
Mlst = list(map(int, sys.stdin.readline().split()))

for i in range(N):
    print(f'cnt = {bin_search(Nlst, Mlst[i])}')
