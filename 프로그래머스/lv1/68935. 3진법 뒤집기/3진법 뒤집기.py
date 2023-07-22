import math
def solution(n):
    total = 0
    
    namuji=0
    res=[]
    while True:
        namuji=n%3
        res.append(namuji)
        n=n//3
        
        if n==0:
            break
    for i in range(len(res)):
        p=int(math.pow(3,len(res)-1-i))
        #print(p)
        total+=res[i]*p
    return total