import sys; input = sys.stdin.readline
from collections import deque

def bfs(node):
    queue = deque([node])
    while queue:
        v = queue.popleft()
        for i in graph[v]:
            if not visited[i]:
                queue.append(i)
                visited[i] = visited[v] + 1

n = int(input())    # 노드 수
chon1, chon2 = map(int, input().split())
m = int(input())    # 간선 수
graph = [[] for _ in range(n+1)]
visited = [0]*(n+1)
for _ in range(m):
    x, y = map(int, input().split())
    graph[x].append(y)
    graph[y].append(x)
bfs(chon1)
print(visited[chon2] if visited[chon2] > 0 else -1)
