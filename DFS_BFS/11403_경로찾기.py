import sys; input = sys.stdin.readline
from collections import deque

def bfs(node):
    visited = [0] * n
    queue = deque([node])
    
    while queue:
        v = queue.popleft()
        for i in graph[v]:
            if not visited[i]:
                visited[i] = 1
                queue.append(i)
    
    for i in range(n):
        print(visited[i], end = ' ')
    print()

n = int(input())
graph = [[] for _ in range(n)]
for i in range(n):
    nodeLine = list(map(int, input().split()))
    for k in range(n):
        if nodeLine[k]:
            graph[i].append(k)

for i in range(n):
    bfs(i)    
