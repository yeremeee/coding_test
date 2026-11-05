def solution(nums):
    count = len(nums) // 2
    types = len(set(nums))
        
    return min(count, types)