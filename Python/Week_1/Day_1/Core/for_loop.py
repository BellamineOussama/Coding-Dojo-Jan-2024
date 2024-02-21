# 1) Basic - Print all integers from 0 to 150.
for i in range(151):
    print(i)


# 2) Multiples of Five - Print all the multiples of 5 from 5 to 1,000

for j in range(5, 1001):
    if j % 5 == 0:
        print(j)
    
# 3 ) Print integers 1 to 100. If divisible by 5, print "Coding" instead. If divisible by 10, print "Coding Dojo".
for k in range(1, 101):
    if k % 5 == 0 and k % 10 != 0:
        print("Coding")
    elif k % 10 == 0: 
        print("Coding Dojo")
    else:
        print(k)
        
# 4) Whoa. That Sucker's Huge - Add odd integers from 0 to 500,000, and print the final sum.
sum = 0
for n in range(500001):
    if n % 2 !=0 :
        sum+=n
print(sum)

# Countdown by Fours - Print positive numbers starting at 2018, counting down by fours.
for h in range(2018, 0, -4):
    print(h)
    
    
# Flexible Counter:
low_num = 2
high_num = 9
mult = 3
for z in range(low_num, high_num+1):
    if z % mult == 0:
        print(z)