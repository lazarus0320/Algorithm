def solution(numbers):
    answer = ''
    
    s_numbers = sorted(numbers, key = lambda x: str(x) * 3, reverse = True)
    answer = ''.join(map(str, s_numbers))
    
    return '0' if answer[0] == '0' else answer