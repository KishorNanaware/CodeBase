import numpy as np

dataSet1K= np.arange(10)

splitInto3Set=np.array_split(dataSet1K,3)

print(splitInto3Set)
