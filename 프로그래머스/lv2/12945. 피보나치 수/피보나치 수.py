def solution(n):
    answer = 0
    a=[]
    a.append(0)
    a.append(1)
    for i in range(2,n+1):
        #print(a[i-1])
        a.append(a[i-1]+a[i-2])
        a[i]=a[i]%1234567
    return a[-1]