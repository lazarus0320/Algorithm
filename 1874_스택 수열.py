import sys
from collections import deque
input = sys.stdin.readline
n = int(input())
stack = deque()
lst = []
cnt = 1
flag = True
for _ in range(n):
    num = int(input())
    while cnt <= num:
        lst.append(cnt)
        stack.append('+')
        cnt += 1
    if num == lst[-1]:
        lst.pop()
        stack.append('-')
    else:
        flag = False

if flag == False:
    print('NO')
else:
    for i in stack:
        print(i)