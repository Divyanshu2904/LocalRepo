import pandas as pd

num1 = [1, 2, 3, 4, 5]

pd. Series (num1)

num2 = [6, 7, 8, 9, 10]

pd. Series (num2)

add = [pd. Series (num1)+pd. Series (num2)]
subtract = [pd. Series (num1) - pd. Series (num2)]
multiply = [pd. Series (num1)* pd. Series (num2)]

div = [pd.Series (num1)/pd.Series (num2)]

print (add)
print (subtract)
print (multiply)
print (div)
