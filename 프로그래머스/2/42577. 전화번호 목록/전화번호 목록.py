def solution(phone_book):

    book = {}
    
    for pb in phone_book:
        book[pb] = book.get(pb, 0) + 1
        
    for num in phone_book:
        for i in range(len(num)):
            n = num[:i+1]
            if n in book and n != num:
                return False
    return True