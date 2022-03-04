import sys
N = int(sys.stdin.readline())
f = 1
for i in range(1, N+1):
    f *= i

cnt = 0
while True:
    if f % 10 == 0:
        cnt += 1
        f = f // 10
    else:
        print(cnt)
        break