import sys
lst = []
def sos(M, N):
    summ = 0
    for i in range(M, N+1):
        if i == 1:
            continue
        else:
            for j in range(2, i):
                if i % j == 0:
                    break
            else:
                lst.append(i)
    return sum(lst)

M = int(sys.stdin.readline())
N = int(sys.stdin.readline())

summ = 0
a = sos(M, N)
if a == 0:
    print(-1)
else:
    print(a)
    print(min(lst))
