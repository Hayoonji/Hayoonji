def solution(num):
    answer = 0
    if num==1:
        return 0
    
    while num!=1: #조건문이 참일때까지
        answer=answer+1
        #print(answer)
        if num%2==0:
            num=num/2
        else:
            num = num * 3 + 1
            
        if answer==500:
            return -1
        
    return answer
    
    