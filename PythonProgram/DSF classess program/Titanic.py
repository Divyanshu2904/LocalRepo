# Write a panda program to create a pivot table with multiple index from the dataset titanic.CSV

import pandas as pd
df = pd.read_csv('Titanic.csv')
print(df.to_string())
print(pd.options.display.max_rows)


