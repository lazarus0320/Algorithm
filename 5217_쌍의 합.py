import sys
num = int(sys.stdin.readline())

for _ in range(num):
    lst = []
    a = int(sys.stdin.readline())
    for i in range(1, a):
        for j in range(i+1, a):
            if i == j:
                continue
            elif i+j == a:
                lst.append((i, j))
    result = f'Pairs for {a}: '
    for l in lst:
        aa = f'{l[0]} {l[1]}'
        result += ', '.join(aa)
    print(result)
    lst = []                