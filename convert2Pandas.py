import pandas as pd
import numpy as np

votes = np.array([120,420,840])
restaurant= np.array(["Resturant1","Resturanst2","Resturant3"])
rating =np.array([4.5,3.5,4])


votes= pd.Series(votes,index=restaurant,name="VOTES")

votes
