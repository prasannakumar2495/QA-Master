'''
Created on 25-Dec-2018

@author: prasannakumar
'''
def listOf_tuple():
    friends = [('pk','kp'),('dj','jd')]
    print(friends[1])
    name_my = input('give your name')
    print(name_my)
    
#you can see the difference in the lines of the code.
#below is the code for parameterization
def my_name(name, age):
    print('hello'+ name+'your age is'+str(age))

listOf_tuple()
my_name('kumar', 23)
