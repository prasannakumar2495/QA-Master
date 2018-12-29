'''
Created on 29-Dec-2018

@author: prasannakumar
'''
secret_word = 'prasanna kumar'
guess = input('enter the guessing word')
while guess != secret_word:
    if guess.__contains__('prasanna') or guess.__contains__('kumar'):
        guess= input('your guess contains one of the two words, try again: ')
    else:
            guess = input('try again: ')
print('you win')