def solution(nums):
    answer = 0
    dict = {}
    for num in nums:
        dict[num] = dict.get(num, 0) + 1
        
    goal = len(nums) // 2
    if len(dict) < goal:
        answer = len(dict)
    else:
        answer = goal
    
    return answer

# 1 1 1 1 => goal: 2, len(dict) : 1 -> len(dict)
# 1 2 3 4 => goal: 2, len(dict) : 4 -> goal
# 1 2 3 4 5 6
# 1 1 1 1 1 1