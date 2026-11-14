def solution(l, r):
    answer = []
    
    for i in range(l, r+1):
        check = True
        s_num = str(i)
        
        for s in s_num:
            if s != '5' and s != '0':
                check = False
        
        if check:
            answer.append(int(s_num))
            
    return answer if answer else [-1]