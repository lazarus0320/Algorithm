def solution(n, arr1, arr2):
    answer = []
    
    for i, j in zip(arr1, arr2):
        
        temp_str = ""
        trans1 = str(bin(i)[2:]).zfill(n)
        trans2 = str(bin(j)[2:]).zfill(n)
        for index in range(n):
            if trans1[index] == '1' or trans2[index] == '1':
                temp_str += "#"
            else:
                temp_str += " "
        
        answer.append(temp_str)
    
        
    return answer