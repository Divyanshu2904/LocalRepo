# count the digit of the number using recursion.

def count_digits(n):
    if n == 0:
        return 0
    # Recursive case: count the number of digits in n/10
    return 1 + count_digits(n/10)

# Example usage
number = int(input("Enter a number: "))
print(f"The number of digits in {number} is: {count_digits(number)}")
