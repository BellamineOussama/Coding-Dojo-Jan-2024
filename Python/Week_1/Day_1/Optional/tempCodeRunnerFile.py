num1 = 42 # number type integer
# num2 = 2.3 # declaretion number type float
# boolean = True # type boolean
# string = 'Hello World' # string type
# pizza_toppings = ['Pepperoni', 'Sausage', 'Jalepenos', 'Cheese', 'Olives'] # list of pizza toppings
# person = {'name': 'John', 'location': 'Salt Lake', 'age': 37, 'is_balding': False} # dictionary for person
# fruit = ('blueberry', 'strawberry', 'banana') # tuples of fruit 
# print(type(fruit))  # type of fruit : tuple
# print(pizza_toppings[1]) #  print sausage
# pizza_toppings.append('Mushrooms') # add Mushrooms to the and of the list 
# print(person['name']) # print 'Jone'
# person['name'] = 'George' # the name change to be George
# person['eye_color'] = 'blue' # add string in the dictionary 
# print(fruit[2]) # print banana (index 2)

# if num1 > 45: # ==> false
#     print("It's greater") # ==> false
# else:
#     print("It's lower") # ==> print : It's lower

# if len(string) < 5:  # ==> len string is 11 ==> false
#     print("It's a short word!")
# elif len(string) > 15: # ==> len string is 11 ==> false
#     print("It's a long word!")
# else:
#     print("Just right!") # ==> print : just right!

# for x in range(5): # x in range(0,5) 
#     print(x) # ==> print : 0, 1, 2, 3, 4
# for x in range(2,5): 
#     print(x) # ==> 2, 3, 4
# for x in range(2,10,3):
#     print(x) # ==> 2, 5, 8
# x = 0
# while(x < 5):  # start : x = 0 , stop : x = 4, increment x = x + 1  
#     print(x) # ==> print : 0, 1, 2, 3, 4
#     x += 1

# pizza_toppings.pop() # ==> print : ['Pepperoni', 'Sausage', 'Jalepenos', 'Cheese', 'Olives']
# pizza_toppings.pop(1) # ==> print :  ['Pepperoni', 'Jalepenos', 'Cheese', 'Olives']

# print(person)  # ==> {'name': 'George', 'location': 'Salt Lake', 'age': 37, 'is_balding': False, 'eye_color': blue  }
# person.pop('eye_color')
# print(person) # ==> print : {'name': 'George', 'location': 'Salt Lake', 'age': 37, 'is_balding': False  }

# for topping in pizza_toppings:
#     if topping == 'Pepperoni':
#         continue
#     print('After 1st if statement') # ==> print : 3 times 
#     if topping == 'Olives':
#         break
