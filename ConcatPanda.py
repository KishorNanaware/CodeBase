import pandas as pd
import numpy as np

resturant = np.array(["Res1","Res2","Res3","Res4","Res5"])
rating= np.array([2.2,3.3,4.3,5,3])
score=np.array([100,200,300,40,50])

resturant_series=pd.Series(resturant,index=resturant,name="Resturant")

rating_series=pd.Series(rating,index=resturant,name="Rating")

score_series=pd.Series(score,index=resturant,name="score")

pd_data=pd.concat([resturant_series,rating_series,score_series],axis=1)
