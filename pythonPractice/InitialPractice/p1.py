'''
Created on 09-Dec-2018

@author: prasannakumar
'''
#https://www.youtube.com/watch?v=rfscVS0vtbw
#this is the URL for the python class that lasts for 4:30 HRS
from StdSuites.AppleScript_Suite import string
from idlelib.ReplaceDialog import replace
from __builtin__ import str
from math import *

print('hello world')

#practice of variables

integer_value = -30
string_value = 'prasanna kumar'

#in python we cannot concatinate an integer value directly with an string value.
#the following line of code will be giving error.
#print("test" + integer_value + string_value)

integer_value2 = str(30)
print(integer_value2 + " "+ string_value)

#user can even do the concatination by backtick(`)
print(`integer_value`+ " "+string_value)

#the variables in python are static(i.e: they always take the lines of code that is written after updating the value of the variable will be displayed.)

string_value ='my name is prasanna kumar'
print(`integer_value` + string_value)

#in python "\" is an escape character (this will be working for the special characters that are mentioned after he backslash)

print("prasanna\"kumar")
#\n is an command for new line

print("prasanna\nkumar")

print(len(string_value))
print(string_value[5])

print(string_value.index("a"))

print(string_value.replace("prasanna", str(23)))

print(abs(integer_value))
print(pow(2, 3))

print("the round off of the number---> "+str(round(234.231)))

print(floor(3.9))
print(ceil(9.1))







