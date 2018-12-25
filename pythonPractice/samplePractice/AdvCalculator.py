'''
Created on 25-Dec-2018

@author: prasannakumar
'''
num1 = float(input('enter the first number'))
op = input('enter the operator')
num2 = float(input('enter the second number'))

def advcal():
    if op == '+':
        result = num1+num2
        print(result)
    elif op == '-':
        result = num1-num2
        print(result)
    elif op == '/':
        result = num1/num2
        print(result)
    elif op == '*':
        result = num1*num2
        print(result) 
    else:
        print('invalid operator')
advcal()