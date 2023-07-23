def solution(n):

    cnt=0
    for i in range(1,n+1):
        answer = 0
        answer+=i
        
        for j in range(i+1,n+1):
            if answer<n:
                answer+=j
            elif answer>n:
                break
            else:
                cnt+=1
                break
    return cnt+1