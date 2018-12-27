'''
Created on 28-Dec-2018

@author: prasannakumar
'''
shortcutcreations = {
    #all the key values should be uniques.
    #the key and the abbreviation values can also be numbers.
    0: "prasanna kumar",
    "kp": "kumar Prasanna",
    "jp": "jai prakash",
    }
#when the user uses the get method, then if he gives an invalid values then it will return none.
print(shortcutcreations.get(0))

students = shortcutcreations.copy()
print(students)

shortcutcreations.update({0:1,"bdy":2495})
print(shortcutcreations)

del shortcutcreations["kp"]
print(shortcutcreations)

print("the shortcut's created are: "+str(list(shortcutcreations.items())))