import pandas as pd

data={
        'name': ['Jim', 'Clarke', 'Kent', 'Mark'],
        'username': ['itsjimhere', 'clark002', 'itskentment', 'markyoumustknow'],
        'userid': [20, 10, 86, 21]
     }
def checkName(name,userName):
    return name.lower() in userName


df = pd.DataFrame(data)
df[~df.apply(lamda x:checkName(x['name'],x['userName']),axis=1)[userid]]
