def solution(s):
    answer = True
    s = s.lower()
    p_count = 0
    y_count = 0
    
    for str in s:
        if str == 'p':
            p_count += 1
        elif str == 'y':
            y_count += 1
    
    if p_count != y_count:
        answer = False
        
    return answer