import sys
from collections import deque

queue = deque()
answer = []
input = sys.stdin.readline()
N, K = map(int, input().split())
for i in range(1, N+1):
    queue.append(i)

while queue:
    for i in queue(K-1):
        queue.append(queue.popleft())
    answer.append(queue.popleft())

print("<")
for i in range(len(answer)-1):
    print("%d, "%answer[i], end='')
print(answer[-1], end='')
print(">")