from collections import deque

def solution(maps):
    answer = 0
    rows = len(maps)
    cols = len(maps[0])
    
    dr = [0, 0, 1, -1]
    dc = [1, -1, 0, 0]
    
    visited = [[False] * cols for _ in range(rows)]
    
    def bfs(row, col, dist):
        visited[row][col] = True
        queue = deque([(row, col, dist)])
        
        while queue:
            r, c, d = queue.popleft()
            
            if r == rows - 1 and c == cols - 1:
                return d
            
            for i in range(4):
                nr = r + dr[i]
                nc = c + dc[i]
            
                if 0 <= nr < rows and 0 <= nc < cols:
                    if not visited[nr][nc] and maps[nr][nc] == 1:
                        visited[nr][nc] = True
                        queue.append((nr, nc, d + 1))
            
        return -1
    
    return bfs(0, 0, 1)
    
    