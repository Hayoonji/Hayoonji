
def solution(numbers):
    result=''
    #1. str으로 바꿔주기
    numbers=list(map(str,numbers))
    #2. 같은 숫자를 4번 반복하는 기준으로 sorting하기
    # 역순으로 해야 큰 순서대로 됨
    numbers.sort(key=lambda x: (x*4)[:4],reverse=True)
    #3. 다 붙여주기
    result=''.join(numbers)
    #4. 예외처리) 0으로 시작하면 0이므로 0으로 리턴
    if result[0] == '0':
        return '0'
    else:
        return result
    return result

    



