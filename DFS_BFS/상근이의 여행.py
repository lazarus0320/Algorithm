import sys; input = sys.stdin.readline
def dfs(graph, v, visited):
    global cnt
    cnt += 1
    visited[v] = True
    
    for i in graph[v]:
        
        if not visited[i]:
            dfs(graph, i, visited)


T = int(input())
for _ in range(T):
    N, M = map(int, input().split())
    graph = [[] for _ in range(N+1)]
    for _ in range(M):
        x, y = map(int, input().split())
        graph[x].append(y)
        graph[y].append(x)
    visited = [False] * (N+1)
    cnt = 0
    dfs(graph, 1, visited)
    print(cnt-1)
