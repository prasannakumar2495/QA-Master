'''
Created on 02-Jan-2019

@author: prasannakumar
'''
def translator(phrase):
    translated_phrase = ''
    for letter in phrase:
        if letter.lower() in 'aeiou':
            if letter.isupper():
                translated_phrase= translated_phrase+'G'
            else:
                translated_phrase= translated_phrase+'g'
        else:
            translated_phrase= translated_phrase+letter
    return translated_phrase

print(translator(input('enter the phrase:')))