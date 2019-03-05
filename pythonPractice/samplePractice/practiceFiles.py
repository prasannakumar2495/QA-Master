'''
Created on 04-Jan-2019

@author: prasannakumar
'''
test_file = open('testFile.txt', 'r')
#print(test_file.readlines()[1])
print(test_file.readable())
print(test_file.read())
#print(test_file.readline()[1])

test_file.close()

test_file = open('testFile.txt', 'a')
#writing like this always add the new context to the current end line but not to the new line.
test_file.write('company : Emids')

#the following will add the new context to the new line
test_file.write('\nexperience: 10 months')
test_file.close()

#this will create a new file or even can be used to re-write the existing file but that will delete all the data in the existing file.
#we can create any format of files using this function just by using the right extension.
test_file = open('index.html','w')
test_file.write('<p>This is HTML page</p>')
test_file.close()