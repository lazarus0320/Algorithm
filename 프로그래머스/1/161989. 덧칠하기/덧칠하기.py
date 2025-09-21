def solution(n, m, section):
    answer = 0
    edge = 0    
    
    for sec in section:
        
        if sec > edge:
            edge = sec + m - 1
            answer += 1
        
        
    return answer

'''
칠했다는 표시를 기록할 리스트 필요?
[true, false, false, true, true, flase, true, true]

칠할 수 있는 영역 한계는 n-m+1

section 원소 기준으로 m-1 뒤칸까지 안칠해진 부분이 있거나
칠할 수 있는 영역 한계 내에 있는 경우 칠한다.

'''