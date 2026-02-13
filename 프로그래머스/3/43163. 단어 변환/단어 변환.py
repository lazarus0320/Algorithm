from collections import deque

def can_change(word1, word2):
    diff_count = 0
    
    for char1, char2 in zip(word1, word2):
        if char1 != char2:
            diff_count += 1
            
    return diff_count

def solution(begin, target, words):
    answer = 0
    
    if target not in words:
        return 0
    
    visited = {}
    
    for word in words:
        visited[word] = False
    
    def bfs(begin):
        visited[begin] = True
        queue = deque([(begin, 0)])
        
        if begin in visited:
            visited[begin] = True
        
        while queue:
            curr, count = queue.popleft()
            
            if curr == target:
                return count
            
            for word in words:
                if not visited[word] and can_change(curr, word) == 1:
                    visited[word] = True
                    queue.append((word, count + 1))
        
        return 0

    
    return bfs(begin)