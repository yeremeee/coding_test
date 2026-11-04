import math

def solution(signals):
    cycles = []
    
    for g, y, r in signals:
        cycles.append(g + y + r)
        
    limit = math.lcm(*cycles)
    
    for t in range(1, limit + 1):
        all_yellow = True
        
        for g, y, r in signals:
            cycle = g + y + r
            remain = (t - 1) % cycle
            
            if not (g <= remain < g + y):
                all_yellow = False
                break
        
        if all_yellow: 
            return t
        
    return -1
        

