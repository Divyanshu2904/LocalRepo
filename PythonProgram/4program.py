#WAP in phython to check whether the number entered by user.
def check_number():
    """
    This function takes a number as input from the user and checks whether it is positive, negative, or zero.
    """

    while True:
        try:
            number = float(input("Enter a number: "))
            break
        except ValueError:
            print("Invalid input. Please enter a number.")

    if number > 0:
        print("The number is positive.")
    elif number < 0:
        print("The number is negative.")
    else:
        print("The number is zero.")

check_number()