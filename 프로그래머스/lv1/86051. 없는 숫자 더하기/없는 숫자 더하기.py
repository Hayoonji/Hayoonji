def solution(numbers):
    answer = 0
    for i in range(len(numbers)):
        answer+=numbers[i]
    
    return 45-answer