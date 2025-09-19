def solution(s):
    
    list = sorted(s, reverse = True)
    answer = ""
    for l in list:
        answer += l
    
    return answer