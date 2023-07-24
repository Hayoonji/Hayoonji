import itertools
def solution(number):
    answer = 0
    all=list(itertools.combinations(number,3))
    count=0
    for i in range(len(all)):
        nujeok=0
        for j in range(len(all[i])):
            nujeok+=all[i][j]
        if nujeok==0:
            count+=1
    
    
    return count