'''
Created on 04-Jan-2019

@author: prasannakumar
'''
test_file = open('testFile.txt', 'r')
print(test_file.readlines()[1])
print(test_file.readable())
print(test_file.read())
print(test_file.readline())

test_file.close()