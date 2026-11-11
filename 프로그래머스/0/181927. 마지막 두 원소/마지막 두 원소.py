def solution(num_list):
    last = num_list[-1]
    before = num_list[-2]

    if last > before:
        num_list.append(last - before)
    else :
        num_list.append(last * 2)
        
    return num_list