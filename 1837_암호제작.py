import sys
P, K = map(int, sys.stdin.readline().split())
flag = False
for d in range(2, K):
    if P % d == 0:
        print(f'BAD {d}')
        flag = True
        break

if flag == False:
    print('GOOD')