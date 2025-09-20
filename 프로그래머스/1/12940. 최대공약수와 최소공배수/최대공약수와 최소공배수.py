import math

def gcd(n, m):
    if n % m == 0:
        return m
    else:
        return gcd(m, n % m)

def lcm(n, m):
    return (n * m) // gcd(n, m)

def solution(n, m):
    answer = [gcd(n, m), lcm(n, m)]
    
    return answer