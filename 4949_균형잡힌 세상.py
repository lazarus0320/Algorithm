import sys
from collections import deque

while True:
    word = sys.stdin.readline().rstrip()
    s, b = 0, 0
    dq = deque()
    if word == '.':
        break
    for w in word:
        flag = 0
        if w == '(':
            dq.append('s')
        elif w == '[':
            dq.append('b')
        elif w == ')':
            flag += 1
            dq.append('s')
        elif w == ']':
            flag += 1
            dq.append('b')
        
        if flag == 1:
            if len(dq) == 1:
                print("no")
                break
            if dq[-1] == dq[-2]:
                dq.pop()
                dq.pop()
            else:
                print("no")
                break
        
    else:
        if len(dq) == 0:
            print("yes")
        else:
            print("no")