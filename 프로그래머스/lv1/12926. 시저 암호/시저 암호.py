def solution(s, n):
    answer = ''
    
    s = list(s)
    for i in range(len(s)):
        if s[i].isupper():
            s[i]=chr((ord(s[i])-ord('A')+ n)%26+ord('A'))
        elif s[i].islower():
            s[i]=chr((ord(s[i])-ord('a')+ n)%26+ord('a'))

    return "".join(s)
    # 2. 초과시 빼주기
    #for i in range(len(a)):
     #   if a[i]>122:
      #      a[i]=a[i]-26
       # elif (a[i]>90) & (a[i]<97):
        #    a[i]=a[i]-26
        #else:
         #   a[i]=a[i]
    # 3. char로 변환
    #for i in range(len(a)):
     #     a[i]=chr(a[i])
    #result="".join(a)
    #return b