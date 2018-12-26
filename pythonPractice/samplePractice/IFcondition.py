'''
Created on 25-Dec-2018

@author: prasannakumar
'''
number = False
string = False

if number or string:
    print('either of the above statements are true')
else:
    print('neither of the above statements are true')

if number:
    print('either of the above statements are true')

elif not(string) and number:
    print('the data is not string but number')
elif not(number) and string:
    print('the data is not number but string')
else:
    print('neither of the above statements are true')
    
num1 = input('enter the 1st number')
num2 = input('enter the 2nd number')
num3 = input('enter the 3rd number')


def max_num():  
    if num1>num2 and num1>num3:
        return num1
    elif num2>num1 and num2>num3:
        return num2
    else:
        return num3 
print(max_num())