# write a pandas program to convert a numpy array to a pandas series and dictionary to the panda series.

import pandas as pd
import numpy as np


arr = np.array([1, 2, 3, 4, 5])
series_from_array = pd.Series(arr)
print("Series from Array:")
print(series_from_array)


my_dict = {'a': 10, 'b': 20, 'c': 30}
series_from_dict = pd.Series(my_dict)
print("\nSeries from Dictionary:")
print(series_from_dict)