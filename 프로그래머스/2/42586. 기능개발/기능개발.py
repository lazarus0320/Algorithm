import math

def solution(progresses, speeds):
    answer = []
    
    # 1. 각 원소별로 남은 시간을 먼저 리스트화 한다.
    # 2. 지금 위치한 원소의 남은시간 < 다음 원소 남은시간 -> 1건
    # 3. 지금 위치한 원소 남은시간(위치 고정) > 다음 원소 남은시간
    # 3-1. 다음 인덱스 넘어가면서 처음 고정한 위치랑 비교.. 반복하면서 카운트 -> n건 반환
    
    prev_time = math.ceil((100 - progresses[0]) / speeds[0])
    count = 1
    for i in range(1, len(progresses)):
        cur_time = math.ceil((100 - progresses[i]) / speeds[i])
        
        if prev_time < cur_time:
            answer.append(count)
            prev_time = cur_time
            count = 1
        
        else:
            count += 1
    answer.append(count)
    return answer