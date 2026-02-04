def solution(arr):
    # append할 때 앞 인덱스 값과 다르면 넣기
    # stack 자체를 답으로?
    
    stack = []
    stack.append(arr[0])
    for i in range(1, len(arr)):
        if arr[i-1] != arr[i]:
            stack.append(arr[i])
    
    return stack