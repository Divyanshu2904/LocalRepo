# Display the fibinoci series using recursion.

def fibonacci(n):
    if n <= 1:
        return n
    else:
        return fibonacci(n-1) + fibonacci(n-2)
    
def display_fibonacci_series(n):
    for i in range(n):
        print(fibonacci(i), end=' ')

# Example usage
n = 10  
display_fibonacci_series(n)