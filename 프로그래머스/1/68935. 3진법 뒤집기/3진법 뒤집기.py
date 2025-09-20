def solution(n):
    answer = 0
    temp_list = []
    
    while n >= 3:
        temp_list.append(n % 3)
        n = n // 3
        
    if n > 0:
        temp_list.append(n)
        
    for i in range(len(temp_list)):
        
        answer += (temp_list[i] * (3 ** (len(temp_list) - 1 - i)))
    # 2 x 3^1 + 1 x 3^0
    return answer