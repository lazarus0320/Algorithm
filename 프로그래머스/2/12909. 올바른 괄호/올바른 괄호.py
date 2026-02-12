def solution(s):
    answer = True
    
    # )가 올때 앞의 값이 있으면 뽑기
    # 비어있는데 )가 오면 False
    # 맨 마지막에 안비어있으면 False
    
    stack = []
    
    for cur in s:
        if cur == ')':
            if len(stack) == 0:
                answer = False
                break
            stack.pop()
        
        else:
            stack.append('(')
    
    if len(stack) > 0:
        answer = False
        
    return answer