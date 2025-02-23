#WAP in phython to find out whether the given is odd or even.

def check_odd_or_even(number):
    if number % 2 == 0:
        return "Even"
    else:
        return "Odd"

number = int(input("Enter a number to check if it is odd or even: "))
result = check_odd_or_even(number)
print(f"The number {number} is {result}.")
