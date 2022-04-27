import sys; input = sys.stdin.readline
from collections import deque

def bfs(node):
    queue = deque([[node, 0]])
    visited = [False] * n
    cnt = 0
    visited[node] = True
    while queue:
        a, b = queue.popleft() # a=현재 노드 , b=탐색 노드
        if b>=2:
            continue
        for i in range(n):
            if not visited[i] and graph[a][i] == 'Y':
                visited[i] = True
                queue.append([i, b+1])
                cnt += 1
    return cnt
                
          
n = int(input())
graph = [list(input().rstrip()) for _ in range(n)]
res = 0
for i in range(n):
    res = max(res, bfs(i))
print(res)
