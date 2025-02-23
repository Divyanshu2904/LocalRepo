# Design and implement Program to sort a given set of n integer elements using Selection Sort method and 
# compute its time complexity. Run the program for varied values of n> 5000 and record the time taken to sort.
# Plot a graph of the time taken versus n. The elements can be read from a file or can be generated using the random number generator.

#######################################################################PROGRAM###############################################################################

# Selection sort in Python
# time complexity O(n*n)
#sorting by finding min_index 
import time
start = time.time()

def selectionSort(array, size):
    
    for ind in range(size):
        min_index = ind
 
        for j in range(ind + 1, size):
           
            # select the minimum element in every iteration
            if array[j] < array[min_index]:
                min_index = j
        
         # swapping the elements to sort the array
        
        (array[ind], array[min_index]) = (array[min_index], array[ind])

#To generate random Numbers
import random

random_numbers1 = []
for i in range(10):
  random_numbers1.append(random.randint(1,5000))  # Adjust the range as needed
print(random_numbers1)

random_numbers2 = []
for i in range(10):
  random_numbers2.append(random.randint(1,5000))  # Adjust the range as needed
print(random_numbers2)

#arr1 = [2, 45, 0, 11,9,88,97,202,747]
#arr2 = [23,45,12,22,19,67,110,234,456]'''
size1 = len(random_numbers1)
size2 = len(random_numbers2)

selectionSort(random_numbers1, size1)
selectionSort(random_numbers2, size2)

print('The array after sorting in Ascending Order by selection sort is:')
print(random_numbers1)
print("\n")
print(random_numbers2)

import matplotlib.pyplot as plt
plt.plot(random_numbers1)
plt.plot(random_numbers2)
plt.grid(True)

# naming the x axis
plt.xlabel('x - TIME')

# naming the y axis
plt.ylabel('y - ARRAY')

# giving a title to my graph
plt.title('Time complexity of Selection Sort')
plt.legend()
# function to show the plot
plt.show()


