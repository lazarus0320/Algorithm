def solution(participant, completion):
    answer = ''
    part = {}
    
    for pa in participant:
        part[pa] = part.get(pa, 0) + 1
    
    for co in completion:
        part[co] -= 1
        
    for name, count in part.items():
        if count >= 1:
            answer = name
    return answer