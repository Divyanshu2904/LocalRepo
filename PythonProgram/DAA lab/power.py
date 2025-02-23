# Display power of a number using recursion.

def power(base, exp):
    if exp == 0:
        return 1
    else:
        return base * power(base, exp - 1)
    
# Example usage
base = 2
exp = 3
result = power(base, exp)
print(f"{base} raised to the power of {exp} is: {power(base, exp)}")
    