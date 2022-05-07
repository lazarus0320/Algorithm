import sys
cnt = 0
while True:
    L, P, V = map(int, sys.stdin.readline().split())
    if L == P == V:
        break
    cnt += 1
    bonus = V%P
    if bonus > L:
        bonus = L
    print(f"Case {cnt}: {((V // P) * L) + bonus}")
