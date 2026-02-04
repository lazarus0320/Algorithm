def solution(clothes):
    # 종류를 key, 그 수를 dict로 저장. 
    # item()로 순환하면서 각 종류를 곱한 값 - 1(아예 안입은 경우를 제외)
    answer = 1
    dict = {}
    for name, type_name in clothes:
        dict[type_name] = dict.get(type_name, 0) + 1
    
    for k, v in dict.items():
        answer *= v + 1
    
    return answer - 1
    
    