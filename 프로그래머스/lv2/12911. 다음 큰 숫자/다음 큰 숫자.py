def solution(n):
    answer = 0
    #n의 1 개수 세기
    b=bin(n)[2:]
    cnt=0
    for i in b:
        if i=="1":
            cnt+=1
    copy=n
    while True:
        copy=copy+1
        print(copy)
        c=bin(copy)[2:]
        cnt2=0
        
        for i in c:
            if i=="1":
                cnt2+=1
        #print(cnt2)
        if cnt==cnt2:
            break
        
    return copy