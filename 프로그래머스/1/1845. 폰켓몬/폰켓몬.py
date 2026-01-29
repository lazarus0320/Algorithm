def solution(nums):
    answer = 0
    # dict로 빈도수 체크
    dict = {}
    
    for n in nums:
        dict[n] = dict.get(n, 0) + 1
    
    key_num = len(dict)
    
    if len(nums) / 2 <= key_num:
        answer = len(nums) / 2
    else:
        answer = key_num

    return answer
    
    # key 개수와 len(nums) / 2 비교했을때 key가 작거나 작으면 key가 답. key가 더 크면 후자가 답 