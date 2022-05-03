import sys; input = sys.stdin.readline
from collections import deque

def bfs(node):
    queue = deque([node])
    while queue:
        q = queue.popleft()
        if q == K:
            print(visited[q])
            break
        for i in (q-1, q+1, 2*q):
            if  0 <= i <= MAX and not visited[i]:
                queue.append(i)
                visited[i] = visited[q] + 1

N, K = map(int, input().split())
MAX = 100000
visited = [0] * (MAX+1)
bfs(N)
