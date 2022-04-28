import sys; input = sys.stdin.readline
from collections import deque
t = int(input())
for i in range(t):
    p = sys.stdin.readline().rstrip()
    n = int(input())
    arr = sys.stdin.readline().rstrip()[1:-1].split(",")
    queue = deque(arr)
    
    rev, flag = 0, 0
    if n == 0:
        queue = []
    for j in p:
        if j == 'R':
            rev += 1
        elif j == 'D':
            if len(queue) < 1:
                flag = 1
                print("error")
                break
            else:
                if rev % 2 == 0:
                    queue.popleft()
                else:
                    queue.pop()
    
    if flag == 0:
        if rev % 2 == 0:
            print("[" + ",".join(queue) + "]")
        else:
            queue.reverse()
            print("[" + ",".join(queue) + "]")
