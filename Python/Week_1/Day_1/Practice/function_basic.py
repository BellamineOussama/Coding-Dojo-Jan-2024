
# 1) Countdown 
def countdown(num):
    list = []
    for num in range(num, -1, -1 ) :
        list.append(num)
    return list
print(countdown(5))


# 2) Print and Return
def print_return (num1, num2):
    list = [num1,num2]
    print(num1)
    return num2
print(print_return (3,4))


# 3) First Plus Length 
def first_plus_length(list):
    sum = len(list)+list[0]
    return sum
print(first_plus_length([1,2,3,4,5]))


# 4) Values Greater than Second
def values_greater_than_second(list):
    if len(list) < 2 :
        return False
    second_value = list[1]
    new_list = []
    for i in list :
        if i > second_value:
            new_list.append(i)
    return new_list        
print(values_greater_than_second([5,2,3,2,1,4]))


# 5) This Length, That Value
def length_and_value(size, value):
    return [value] * size
print(length_and_value(4,7))
