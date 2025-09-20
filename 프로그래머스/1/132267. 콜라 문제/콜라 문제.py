def solution(a, b, n):
    answer, gainNum, remainNum = 0, 0, 0
    
    
    
    while n > a:
        answer += (n // a) * b
        remainNum = n % a
        n = (n // a) * b + remainNum
        
    answer += (n // a) * b
    
    return answer

# 20개

# 6개받고  2개남음
