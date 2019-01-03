'''
Created on 04-Jan-2019

@author: prasannakumar
'''
try:
    value = 10/0
    number = int(input('enter the number'))
    print(number)
except ZeroDivisionError as err0:
    print('invalid value')
    print(err0)
except ValueError as errv:
    print('invalid input')
    print(errv)
except (ZeroDivisionError, ValueError):
    print('both types of errors')
