from collections import deque


def solution(n, wires):
    graph = [[] for _ in range(n + 1)]
    
    for v1, v2 in wires:
        graph[v1].append(v2)
        graph[v2].append(v1)
    
    
    def get_count(start, v1, v2):
        visited = [False] * (n + 1)
        visited[start] = True
        queue = deque([start])
        count = 1

        while queue:
            curr = queue.popleft()
            for neighbor in graph[curr]:
                if not visited[neighbor]:
                    if (curr == v1 and neighbor == v2) or (curr == v2 and neighbor == v1):
                        continue
                    visited[neighbor] = True
                    queue.append(neighbor)
                    count += 1

        return count
    
    min_diff = n
    
    for v1, v2 in wires:
        count1 = get_count(v1, v1, v2)
        count2 = n - count1
        
        min_diff = min(min_diff, abs(count1 - count2))
    
    
    return min_diff