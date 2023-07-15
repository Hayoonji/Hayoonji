def solution(arr):
    answer = []
    #answer=arr
    temp = -1
    #걍 같으면 뒤에꺼 제거
    for num in arr:

        if num!=temp:
            answer.append(num)
            temp=num
        
           
    return answer