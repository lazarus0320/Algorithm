import sys
N = int(sys.stdin.readline())
for _ in range(N):
    x1, y1, r1, x2, y2, r2 = map(int, sys.stdin.readline().split())
    S = ((x2-x1)**2 + (y2-y1)**2)**0.5

    if r1 == r2 and S == 0:
        print(-1)
    elif S > r1 + r2 or S < abs(r1 - r2):
        print(0)
    elif S == r1 + r2 or S == abs(r1 - r2):
        print(1)
    elif abs(r1 - r2) < S < r1 + r2:
        print(2)
