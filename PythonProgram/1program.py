#WAP in phython that uses a function find out the maxmimum of three no.

def find_max(a, b, c):
    if a >= b and a >= c:
        return a
    elif b >= a and b >= c:
        return b
    else:
        return c
    
x = float(input("Enter First Number : "))
y = float(input("Enter Second Number : "))
z = float(input("Enter Third Number : "))
print ("max of Three Number is : ",find_max(x, y, z))