def solution(dartResult):
    answer = 0
    tempNum = ""
    dart = [0]*3
    idx = 0
    for i in range(len(dartResult)):
        # 문자가 들어오기 전까지 숫자는 일단 합쳐둔다. 두자리수 대비하기 위함

        if dartResult[i] == 'S':
            dart[idx] += int(tempNum)
            idx += 1
            tempNum = ""
        elif dartResult[i] == 'D':
            dart[idx] += int(tempNum) ** 2
            idx += 1
            tempNum = ""
        elif dartResult[i] == 'T':
            dart[idx] += int(tempNum) ** 3
            idx += 1
            tempNum = ""
        elif dartResult[i] == '*':
            dart[idx-1] *= 2
            if idx > 1:
                dart[idx-2] *= 2
        elif dartResult[i] == '#':
            dart[idx-1] *= -1
        
        else: 
            tempNum += dartResult[i]
    
    return sum(dart)

'''
문자 나오면 그 앞에 값에 제곱, 세제곱 등을 해서 합선처리

*나오면 그전에 합산된 값에 x2
#나오면 그전 합산된 값에 -1 곱함
'''