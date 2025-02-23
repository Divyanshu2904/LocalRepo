# STRING

# str1 = "Hello"
# len1 = len(str1)
# str2 = "World"
# len2 = len(str2)
# print(len1+len2)
# print(len1)
# print(len2)


# INDEXING

# str = "Hello World"
# print(str[0]) # H
# print(str[1]) # e
# print(str[2]) # l
# print(str[3]) # l
# print(str[4]) # o
# print(str[5]) # space etc....


# SLICING

# str = "Hello World"
# print(str[0:5]) # Hello
# print(str[6:11]) # World

# print(str[:5]) # [0:5] Hello
# print(str[6:]) # [6: len(str)] World
# print(str[0:len(str)]) # Hello World 
# print(str[-5:-1]) # Worl
# print(str[-5:]) # World



# STRING FUNCTION

# str = "I am studying python from Apna College"
# print(str.endswith("ege")) # True

# str = "i am studying python from Apna College"
# print(str.capitalize()) # I am studying python from apna college

# str = "I am studying python from Apna College"
# print(str.replace("o","a")) # I am studying pythan fram Apna CAllege

# str = "I am studying python from Apna College"
# print(str.find("o")) # 14 

# str = "I am studying python from Apna College"
# print(str.count("from")) # 1



# Question

# WAP to input user's first name & print itz length.
# int1 = input("Enter your first name : ")
# print("Length of your name is :",len(int1))


# # WAP to find the occurance of '$' in a string.
# str = "Hi, $I ma the $best $student"
# print(str.count("$")) # 3

 

#  Conditional Statements

# age = 21
# if (age >= 18):
#     print("can vote")
#     print("can drive") 


# light = "green" 
# if light == "red":
#     print("stop")
# elif light == "green":
#     print("Go")
# elif light == "yellow":
#     print("look")

# else: 
    # print("light is not working")  # light = "another colour"



# num = 10
# if (num > 2):
#     print("Bigger than 2")
# elif (num > 5):
#     print("Bigger than 5")


# marks = int(input("Enter your marks : "))

# if (marks >= 90):
#     print("Grade A")
# elif (marks >= 80 and marks < 90):
#     print("Grade B")
# elif (marks >= 70 and marks < 80):
#     print("Grade C")
# else:
#     (marks < 70)
#     print("Fail")



# Question
# WAP to check if a number entered by the user is odd or even.
# num = int(input("enter the number :"))
# if (num % 2 == 0):
#     print("Even")
# else:
#     print("Odd")


# WAP to find the greatest of 3 numbers entered by the user.
# num1 = int(input("Enter the first number : "))
# num2 = int(input("Enter the second number : "))
# num3 = int(input("Enter the third number : "))
# if (num1 > num2 and num1 > num3):
#     print("Greatest number is : ",num1)
# elif (num2 > num1 and num2 > num3):
#     print("Greatest number is : ",num2)
# else:
#     print("Greatest number is : ",num3)



# WAP to check if a number is a multiple of 7 or not.
num = int(input("Enter the number : "))
if (num % 7 == 0):
    print("Multiple of 7")
else:
    print("Not a multiple of 7")
