from collections import deque
import sys; input = sys.stdin.readline

def bfs(grap, start, visited):
    queue = deque([start])
    visited[start] = True
    while queue:
        v = queue.popleft()
        print(v, end = ' ')
        for i in graph[v]:
            if not visited[i]:
                queue.append(i)
                visited[i] = True

def dfs(graph, start, visited):
    visited[start] = True
    print(start, end = ' ')
    for i in graph[start]:
        if not visited[i]:
            dfs(graph, i, visited)

N, M, V = map(int, input().split())
graph = [[] for _ in range(N+1)]
for i in range(M):
    x, y = map(int, input().split())
    graph[x].append(y)
    graph[y].append(x)
   
for i in range(1, N+1):
    graph[i].sort()

visited = [False] * (N+1)
dfs(graph, V, visited)
print()

visited = [False] * (N+1)
bfs(graph, V, visited)
                
