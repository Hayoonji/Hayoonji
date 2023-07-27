def binary_search(array,target,start,end):
    if start>end:
        return None
    mid=(start+end)//2
    
    if array[mid]==target:
        return mid
    elif array[mid]>target:
        return binary_search(array,target,start,mid-1)
    else:
        return binary_search(array,target,mid+1,end)
    


def check_elements_in_array(a, b):
    a.sort()  # 리스트 a를 오름차순으로 정렬합니다.

    for target in b:
        result = binary_search(a, target, 0, len(a) - 1)

        if result is None:
            print(0)
        else:
            print(1)

n = input()  # 숫자 개수
n_list = input().split()  # 입력받은 숫자들
num = input()
num_list = input().split()


check_elements_in_array(n_list, num_list)