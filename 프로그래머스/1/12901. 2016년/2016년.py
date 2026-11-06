def solution(a, b):
    days = ['SUN', 'MON', 'TUE', 'WED', 'THU', 'FRI', 'SAT']
    months = [31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
    
    total = sum(months[0:a-1]) + (b-1)
    i = (total + 5) % 7
    
    return days[i]