def solution(phone_book):

    # dict에 모든 번호를 등록
    # phone_book에서 하나씩 꺼내서 딕셔너리에 있는 어떤 값과 그 길이 만큼의 앞부분이 같은지 조사
    
    book = {}
    
    for num in phone_book:
        book[num] = book.get(num, 0) + 1
    
    answer = True
    
    for num in phone_book:
        for i in range(len(num)):
            key = num[:i+1]
            target = book.get(key, 0)
            if target == 1 and key != num:
                answer = False
                break
    
    return answer