'''
Created on 11-Feb-2019

@author: prasannakumar
'''
from MultipleChoice import QuestionClass
from builtins import str
questions=[
    "what is my name?\n (a)prasdfw \n (b)prasannakumar \n\n",
    "what is my last name? \n (a)jhgvj \n (b)kumar \n\n"
    ]
question = [QuestionClass(questions[0],"b"),
            QuestionClass(questions[1],"b")
            ]
def run_test(question):
    score=0
    for que in questions:
        answer = input(question)
        if answer == QuestionClass.answer:
            score += 1
    print("you got"+ str(score)+"/"+str(len(questions)))
run_test(question)