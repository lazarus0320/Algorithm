def solution(food):
    answer = "0"
    
    for i in range(len(food) - 1, 0, -1):
        temp = ""
        if food[i] % 2 == 0:
            for j in range(food[i] // 2):
                temp += str(i)
        
        else:
            for j in range((food[i] - 1) // 2):
                    temp += str(i)
        answer = temp + answer + temp
    return answer