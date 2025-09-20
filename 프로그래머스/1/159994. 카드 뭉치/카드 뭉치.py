def solution(cards1, cards2, goal):
    answer = "Yes"
    index1, index2, cur1, cur2 = 0, 0, 0, 0
    
    for word in goal:
        
        if word in cards1:
            cur1 = cards1.index(word)
            if index1 < cur1:
                answer = "No";
            index1 += 1
            
        
        if word in cards2:
            cur2 = cards2.index(word)
            if index2 < cur2:
                answer = "No";
            index2 += 1
            
    return answer