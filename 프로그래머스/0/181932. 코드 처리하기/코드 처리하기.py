def solution(code):
    answer = ''
    mode  = 0
    
    for i in range(0, len(code)):
        c = code[i]
        
        if mode == 0:
            if c == '1':
                mode = 1
                continue
            elif i % 2 == 0:
                answer += c
            
        elif mode == 1:
            if c == '1':
                mode = 0
                continue
            elif i % 2 == 1:
                answer += c
    
    if len(answer) == 0 :
        return 'EMPTY'
    
    return answer