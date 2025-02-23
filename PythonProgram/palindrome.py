#write a python function program to check if a string is a palindrome.

# function which return reverse of a string

def isPalindrome(s):
    return s == s[::-1]


s = "malayalam"
ans = isPalindrome(s)

if ans:
    print("Yes")
else:
    print("No")
