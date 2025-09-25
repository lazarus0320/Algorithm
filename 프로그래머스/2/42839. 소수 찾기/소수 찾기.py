from itertools import permutations
import math

def is_prime(n):
    if n < 2:
        return False
    
    if n == 2:
        return True
    
    if n % 2 == 0:
        return False
    
    for i in range(3, int(math.sqrt(n)) + 1, 2):
        if n % i == 0:
            return False
    
    return True

def solution(numbers):
    answer = 0
    
    all_numbers = set()
    
    for length in range(1, len(numbers) + 1):
        for perm in permutations(numbers, length):
            num_str = ''.join(perm)
            if num_str[0] != '0':
                all_numbers.add(int(num_str))
    
    for num in all_numbers:
        if is_prime(num):
            answer += 1
            
    return answer