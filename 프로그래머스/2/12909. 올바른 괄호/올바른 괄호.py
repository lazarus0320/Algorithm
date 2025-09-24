def solution(s):
    answer = True
    
    stack = []
    
    for i in range(len(s)):
        if len(stack) == 0:
            if s[i] == ')':
                return False
            else:
                stack.append(s[i])
        else:
            if stack[-1] == '(' and s[i] == ')':
                stack.pop()
            elif stack[-1] == ')' and s[i] == '(':
                return False
            else:
                stack.append(s[i])
    
    if len(stack) != 0:
        answer = False

    return answer