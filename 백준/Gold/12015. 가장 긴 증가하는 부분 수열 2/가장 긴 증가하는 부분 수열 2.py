import sys
from bisect import bisect_left
input = sys.stdin.readline

n = int(input())
nums = list(map(int, input().split()))

lis = [0]

for num in nums:
    if lis[-1] < num:
        lis.append(num)
    else:
        lis[bisect_left(lis, num)] = num

print(len(lis)-1)