def solution(number, k):
    answer = ''
    remove = 0
    stack = []
    
    for digit in number:
        while stack and stack[-1] < digit and remove < k:
            stack.pop()
            remove += 1
        stack.append(digit)
        
    while remove < k:
        stack.pop()
        remove += 1
            
    return ''.join(stack)