# write a panda program to convert the first column of the data frane first column and series.

import pandas as pd

df = pd.DataFrame({'A': [1, 2, 3], 'B': [4, 5, 6]})

first_column_series = df.iloc[:, 0] 
print(first_column_series)