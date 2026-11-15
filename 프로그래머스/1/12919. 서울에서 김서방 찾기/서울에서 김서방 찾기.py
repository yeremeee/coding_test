def solution(seoul):
    answer = ''
    
    for s in seoul:
        if s == 'Kim':
            answer = '김서방은 ' + str(seoul.index(s)) + '에 있다'
            
    return answer