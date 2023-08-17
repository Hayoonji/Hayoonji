import sys
input = sys.stdin.readline
n=int(input())
def fibo(n):
    dp=[0]*1001 #dp 리스트에 공간확보
    dp[1]=1
    dp[2]=2
    for i in range(3,n+1):
        dp[i]=(dp[i-1]+dp[i-2])%10007
    return dp[n]


print(fibo(n))