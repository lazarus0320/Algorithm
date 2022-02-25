import sys
from collections import deque
input = sys.stdin.readline
n = int(input())
lst = [int(input()) for _ in range(n)]
slst =[]
stack = deque()
j = 0
cnt = 0
for i in range(1, n+1):
    stack.append('+')
    slst.append(i)
    cnt += 1
    if slst[-1] == lst[j]:
        stack.append('-')
        stack.pop()