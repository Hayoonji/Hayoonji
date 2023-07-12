def solution(x):
    
    answer = True
    x=str(x)
    a=0
    for i in x:
        a+=int(i)
    x=int(x) 
    if x%a==0:
        answer=True
    else:
        answer=False
  
    return answer