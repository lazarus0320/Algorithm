import sys; input = sys.stdin.readline
from collections import deque
def bfs(start, visited, graph):
    queue = deque([start])
    visited[start] = 1
    while queue:

        v = queue.popleft()
        for i in graph[v]:
            if not visited[i]:
                queue.append(i)
                visited[i] = visited[v] + 1


N, M = map(int, input().split()) # N : 유저 수, M : 친구 관계 수
graph = [[] for _ in range(N+1)]
result = []

for _ in range(M):
    x, y = map(int, input().split())
    graph[x].append(y)
    graph[y].append(x)

for i in range(1, N+1):
    visited = [0] * (N+1)
    bfs(i, visited, graph)
    result.append(sum(visited) - visited[i] - (N-1))
print(result.index(min(result))+1)
