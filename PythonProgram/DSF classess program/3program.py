# write a phython program to convert a given list of list into the data frame.

import pandas as pd

data = [['Divyanshu', 22], ['Harsh', 24], ['Kashyap', 20]]

df = pd.DataFrame(data, columns=['Name', 'Age'])
print(df)