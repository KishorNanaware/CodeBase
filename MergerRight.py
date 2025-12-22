import pandas as pd
data1={"ID":[1,2,3],
       "Name":["Jhon","Alice","Bob"],
       "age":[25,20,22]}

data2={"ID":[1,2,4],
       "Salary":[50000,60000,30000]
       }


df1=pd.DataFrame(data1)

df2=pd.DataFrame(data2)


dfMerge = df1.merge(df2,on='ID',how="right")

dfMerge
