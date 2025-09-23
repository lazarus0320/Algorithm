def solution(clothes):
    answer = 1
    
    dict = {}
    
    for clo, type in clothes:
        dict[type] = dict.get(type, 0) + 1
        
    for k, v in dict.items():
        answer *= v+1
    
    
    return answer - 1