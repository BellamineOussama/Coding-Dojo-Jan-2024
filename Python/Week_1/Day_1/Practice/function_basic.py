
# 1) Countdown 
# def countdown(num):
#     list = []
#     for num in range(num, -1, -1 ) :
#         list.append(num)
#     return list
# print(countdown(5))


# 2) Print and Return
# def print_return (num1, num2):
#     list = [num1,num2]
#     print(num1)
#     return num2
# print(print_return (3,4))


sum = 0
def first_plus_length(list):
    sum = len(list) + list[0]

print(first_plus_length([1,2,3,4]))