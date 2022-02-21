import sys
N = sys.stdin.readline().rstrip()
lst = []
for i in N:
    lst.append(int(i))
lst.sort(reverse=True)
for i in lst:
    print(i, end='')