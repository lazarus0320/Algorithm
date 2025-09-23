import math

def solution(progresses, speeds):
    answer = []
    list = []
    
    for i in range(len(progresses)):
        day = math.ceil((100 - progresses[i]) / speeds[i])
        list.append(day)
        
    num = 1
    cur = list[0]
    
    for i in range(1, len(list)):
        if list[i] <= cur:
            num += 1
        else:
            answer.append(num)
            num = 1
            cur = list[i]
        
    answer.append(num)
    
    return answer