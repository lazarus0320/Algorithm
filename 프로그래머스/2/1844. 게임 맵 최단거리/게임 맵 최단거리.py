from collections import deque

def solution(maps):
    answer = 0
    
    n = len(maps)
    m = len(maps[0])
    
    dx = [0, 0, 1, -1]
    dy = [-1, 1, 0, 0]
    
    queue = deque([(0, 0, 1)])
    visited = [[False] * m for _ in range(n)]
    visited[0][0] = True
    
    while queue:
        x, y, dist = queue.popleft()
        
        if x == n-1 and y == m-1:
            return dist
        
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            
            if (0 <= nx < n and 0 <= ny < m and
               maps[nx][ny] == 1 and not visited[nx][ny]):
                visited[nx][ny] = True
                queue.append((nx, ny, dist + 1))
    
    return -1