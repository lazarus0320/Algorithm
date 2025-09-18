def solution(s):
    answer = True
    
    pNum = yNum = 0;
    s = s.lower()
    
    for w in s:
        if w == 'p':
            pNum += 1;
        if w == 'y':
            yNum += 1;
    
    if pNum != yNum:
        answer = False
    

    return answer