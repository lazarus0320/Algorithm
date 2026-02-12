def solution(numbers):
    answer = ''
    

    s_numbers = sorted(numbers, key = lambda x: str(x) * 3, reverse = True)
    answer = ''.join(map(str, s_numbers))
    
    if answer[0] == '0':
        return '0'
    
    return answer