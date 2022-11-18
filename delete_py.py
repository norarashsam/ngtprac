from pymongo import MongoClient
client = MongoClient('localhost',27017)
db=client.TYITDB

def delete():
    try:
        n1=input("Enter the name : ")
        db.TYITCOL.delete_one(
            {"name": n1})
        print("Deleted Successfully")
    except Exception:
        print(str(e))
delete()
