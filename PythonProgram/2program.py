#WAP in phython that uses a function to perform all the algorithmic operation.


#write a phython program to find an odd/even number using a function 


def check_odd_even(num):
    """Function to check if a number is odd or even."""
    if num % 2 == 0:
        return "Even"
    else:
        return "Odd"

    #Taking user input
number = int(input("Enter a number: "))
result = check_odd_even(number)
print(f"The number {number} is {result}.")




