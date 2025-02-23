# write a panda program to create a pivot table and find the surviable grade and by gender on various class.

import pandas as pd

# Load the Titanic dataset (ensure 'titanic.csv' is in the correct path)
df = pd.read_csv('titanic.csv')

# Display the first few rows to understand the dataset structure
print("Sample data:")
print(df.head())

# Create a pivot table to find survival rate by gender across various classes
pivot_table = pd.pivot_table(
    df, 
    values='Survived',        # Aggregating the 'Survived' column
    index='Sex',              # Index by gender
    columns='Pclass',         # Columns for each passenger class
    aggfunc='mean',           # Calculate mean survival rate (survival grade)
    margins=True,             # Add overall summary row/column
    margins_name='Overall'    # Rename the margin as 'Overall'
)

# Display the pivot table
print("\nSurvival Grade by Gender and Class:")
print(pivot_table)
