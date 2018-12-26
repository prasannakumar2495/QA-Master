'''
Created on 25-Dec-2018

@author: prasannakumar
'''
languages = ["telugu" , "hindi", "english", "kannada", "bengali", "odiya", "tamil", "malayalam"]
random_numbers = [2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 12, 23456, 457]
print(languages[1])

# negative input will start from the ending
print(languages[-1])

# to get the values from a particular position

print(languages[1:])
# to get the values in a range

print(languages[1:4])

# if the user wanna update the list 
languages[2] = "french"
print("the original value in the list is 'english', that has been changed to: " + languages[2])

languages.pop()
print(languages)

# 'extend' will join to lists
languages.extend(random_numbers)
print(languages)

# 'append' will add a new number at the end of the list.
languages.append(123)
print(languages)

# if the user wanna enter the value in the middle of the list
languages.insert(2, "prasanna kumar")
print(languages)

# to find if the element exists in the list
print(languages.index("prasanna kumar"))

random_numbers.sort()
print(random_numbers)

random_numbers2 = random_numbers.copy()
print(random_numbers2)

