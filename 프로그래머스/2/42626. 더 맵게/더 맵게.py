import heapq

def solution(scoville, K):
    answer = 0
    heap = scoville.copy()
    heapq.heapify(heap)
    
    while heap[0] < K:
        if len(heap) < 2:
            return -1
        
        first = heapq.heappop(heap)
        second = heapq.heappop(heap)

        new_sco = first + (second * 2)

        heapq.heappush(heap, new_sco)
        answer += 1
        
    return answer