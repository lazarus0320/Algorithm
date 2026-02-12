from collections import deque

def solution(bridge_length, weight, truck_weights):
    
    bridge = deque([0] * bridge_length)
    trucks = deque(truck_weights)
    cur_weight = 0
    answer = 0


    while bridge:
        answer += 1
        cur_weight -= bridge.popleft()
        
        if trucks:
            if weight >= (cur_weight + trucks[0]):
                out_truck = trucks.popleft()
                bridge.append(out_truck)
                cur_weight += out_truck
            else:
                bridge.append(0)
                
            
    return answer