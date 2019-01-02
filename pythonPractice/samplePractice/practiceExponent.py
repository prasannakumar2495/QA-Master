'''
Created on 02-Jan-2019

@author: prasannakumar
'''
def raise_pow(base_num, pow_num):
    result = 1
    for value in range(pow_num):
        result = result*base_num
    return result

print(raise_pow(20430, 1202))