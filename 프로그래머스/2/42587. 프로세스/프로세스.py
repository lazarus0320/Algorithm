from collections import deque

def solution(priorities, location):
    answer = 0
    queue = deque()
    
    for i, pri in enumerate(priorities):
        queue.append((pri, i))
        
    count = 0
    
    while queue:
        cur_pri, cur_idx = queue.popleft()
        
        if any(cur_pri < other_pri for other_pri, _ in queue):
            queue.append((cur_pri, cur_idx))
        else:
            count += 1
            if cur_idx == location:
                return count
    return count