def solution(left, right):
    #answer = 0
    total=0
    for k in range(left,right+1):
        answer = 0
        for i in range(1,k+1):
            #print(k,i)
            if k%i==0:
                answer+=1
        if answer%2==0:
            total+=k
        else:
            total-=k
        print(total)
    return total