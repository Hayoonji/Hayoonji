def solution(s):
    answer = ''
    total=''
    p=s.split()
    
    for i in range(len(p)):
        answer = ''
        b=p[i]
        if b=="":
            continue
        else:
            for j in range(len(p[i])):
                a=p[i]
                if j%2==0:
                    answer+=a[j].upper()
                else:
                    answer+=a[j].lower()
        total+=answer+" "
    return total