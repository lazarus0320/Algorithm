from collections import deque

def solution(n, computers):

    visited = [False] * n
    answer = 0
    
    def bfs(start):
        
        queue = deque([start])
        visited[start] = True
        
        while queue:
            curr = queue.popleft()
            
            for neighbor in range(n):
                if not visited[neighbor] and computers[curr][neighbor] == 1:
                    visited[neighbor] = True
                    queue.append(neighbor)
                    
        
    for i in range(n):
        if not visited[i]:
            bfs(i)
            answer += 1
        
    
    return answer


