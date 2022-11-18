from pymongo import MongoClient
client=MongoClient('localhost',27017)
db=client.TYITDB

def ret():
    try:
        read= db.TYITCOL.find()
        print("data")
        for one in read:
            print(one)
    except Exception:
        print(str(e))
ret()
