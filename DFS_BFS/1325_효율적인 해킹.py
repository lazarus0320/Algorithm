import sys; input = sys.stdin.readline
from collections import deque

def bfs(node):
    queue = deque([node])
    visited = [0] * (N+1)
    visited[node] = 1
    cnt = 0
    while queue:
        v = queue.popleft()
        for i in graph[v]:
            if not visited[i]:
                visited[i] = 1
                queue.append(i)
                cnt += 1
    return cnt

N, M = map(int, input().split())
graph = [[] for _ in range(N+1)]

for _ in range(M):
    x, y = map(int, input().split())
    graph[y].append(x)

hack = []
max_hack = 0
for i in range(1, N+1):
    h = bfs(i)
    if h > max_hack:
        max_hack = h
    hack.append([i, h])

for i, cnt in hack:
    if cnt == max_hack:
        print(i, end = ' ')
