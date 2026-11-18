def solution(a, b, c, d):
    answer = 0
    l = [a, b, c, d]
    sl = list(set(l))
    n = len(sl)
    
    if n == 1:
        answer = 1111 * a
    elif n == 2:
        p, q = sl
        
        if l.count(p) == 3:
            answer = (10 * p + q) ** 2
        elif l.count(q) == 3:
            answer = (10 * q + p) ** 2
        else :
            answer = (p + q) * abs(p - q)
    elif n == 3:
        for num in sl:
            if l.count(num) == 2:
                sl.remove(num)
                break
        answer = sl[0] * sl[1]
    elif n == 4:
        answer = min(sl)
    return answer