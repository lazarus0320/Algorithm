def solution(nums):
    answer = 0
    
    dict = {}

    for n in nums:
        dict[n] = dict.get(n, 0) + 1
        
    
    if len(dict) > len(nums) // 2:
        answer = len(nums) // 2
        
    else:
        answer = len(dict)
    
    return answer