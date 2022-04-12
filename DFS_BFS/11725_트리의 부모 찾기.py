import sys; input= sys.stdin.readline
from collections import deque

def bfs(node):
    queue = deque([node])
    visited[node] = 1
    while queue:
        v = queue.popleft()
        for i in graph[v]:
            if not visited[i]:
                queue.append(i)
                visited[i] = v

N = int(input())
graph = [[] for _ in range(N+1)]
visited = [0] * (N+1)
for _ in range(N-1):
    x, y = map(int, input().split())
    graph[x].append(y)
    graph[y].append(x)
bfs(1)
# for i in range(2, N+1):
#     print(visited[i])
print("\n".join(str(visited[i]) for i in range(2, N+1)))
