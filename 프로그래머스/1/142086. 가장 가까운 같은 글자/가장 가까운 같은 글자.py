def solution(s):
    answer = []
    dict = {}
    
    for i in range(len(s)):
        
        word = s[i]
        
        if word in dict:
            answer.append(i - dict[word])
        else:
            answer.append(-1)
        dict[word] = i
            
    return answer