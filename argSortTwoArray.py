#sort elements in one array and simultaneously arrange the corresponding elements in another array

import numpy as np

ageArray = np.array([5.5, 6.0, 3.5, 1.5, 3.0, 4.0, 3.5, 2.0, 5.5, 6.0])
birdArray = np.array(['spoonbills',  'plovers',  'plovers',  'plovers',  'plovers',  'Cranes',  'plovers',  'plovers',  'Cranes',  'spoonbills'])

sortByAge =ageArray.argsort()
#sortByAge

sortBirdByAge=birdArray[sortByAge]

sortBirdByAge

