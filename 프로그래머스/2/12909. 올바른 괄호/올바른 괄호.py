def solution(s):
    answer = True
    
    # 1. 일단 ( 넣기
    # 2. 없는데 ) 넣으면 false
    # 3. )이거 넣으면 pop
    # 4. stack 에 값 있으면 false
    
    stack = []
    for char in s:
        if len(stack) == 0 and char == ')':
            return False
        elif char == ')':
            stack.pop()
        else: stack.append('(')
    
    if len(stack) > 0:
        return False

    return True