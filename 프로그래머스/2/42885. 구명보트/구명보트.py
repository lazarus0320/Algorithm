def solution(people, limit):
    people.sort()
    answer = 0
    right = len(people) - 1
    left, count = 0, 0
    
    while left <= right:
        if people[left] + people[right] <= limit:
            left += 1
            right -= 1
        else:
            right -= 1
        
        count += 1
    
    return count