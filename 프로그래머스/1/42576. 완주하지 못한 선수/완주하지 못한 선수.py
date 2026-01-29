def solution(participant, completion):
    answer = ''
    list = {}
    for part in participant:
        list[part] = list.get(part, 0) + 1
    
    for comp in completion:
        list[comp] = list.get(comp, 0) - 1
    
    for k, v in list.items():
        if v > 0:
            return k