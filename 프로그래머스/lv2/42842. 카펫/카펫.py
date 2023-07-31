def solution(brown, yellow):
    answer = []
    nums=brown+yellow
    res=[0,0]
    for i in range(1,nums+1):
        if nums%i==0:
            answer.append(i)
    
    i=0
    j=-1
    k=0
    a=0
    #print(answer)
    
    while True :
        
        if len(answer)%2==0:
            res.append(answer[(len(answer)//2)+i])
            i=i+1
            res.append(answer[(len(answer)//2)+j])
            j=j-1
        else:
            res.append(answer[len(answer)//2])
            res.append(answer[len(answer)//2])
        if ((res[-2]-2)*(res[-1]-2)) == yellow:
                break
            
    return [res[-2],res[-1]]