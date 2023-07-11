def solution(s):
    answer = True
    s=s.lower()
    dic={"p":0,"y":0}
    
    for i in s:
        if i =="p" :
            dic["p"]+=1
        elif i=='y':
            dic["y"]+=1
    result=[]
    for i in dic.values():
        result.append(i)
    
    for i in range(2):
        if result[0]==result[1]:
            return True
        else:
            return False
            
            
    
        
        
        
   

