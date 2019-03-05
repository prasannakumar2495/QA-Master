'''
Created on 02-Jan-2019

@author: prasannakumar
'''
number_grid = [[34,324,234],
               [23453,5676,5675],
               [123,12,123],
               [23423]]
print(number_grid[3][0])

for row in number_grid:
    print(row)
    for clmn in row:
        print(clmn)