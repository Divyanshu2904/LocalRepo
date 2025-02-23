# Find the factorial of a number using recursion.

def factorial(n):
    # Base case: 0! = 1
    if n == 0:
        return 1
    # Recursive case: n! = n * (n-1)!
    return n * factorial(n - 1)

