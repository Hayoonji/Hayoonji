def solution(s):
    answer = ''
    l=len(s)
    y=l//2
    z=(l//2)-1
    x=(l//2)+1
    if l%2==0:
        return s[z:x]
    else:
        return s[y]
        
    