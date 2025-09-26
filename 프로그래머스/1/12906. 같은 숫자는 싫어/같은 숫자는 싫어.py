def solution(arr):
    stack = []
    # 1. 순회하면서 넣으려는 값이랑 스택 맨윗값 비교
    # 2. 다른 거 넣는 거만 넣기
    
    stack.append(arr[0])
    
    for i in range(1, len(arr)):
        if stack[-1] != arr[i]:
            stack.append(arr[i])
    
    
    return stack