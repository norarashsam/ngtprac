from pymongo import MongoClient
client=MongoClient('localhost',27017)
db=client.TYITDB
def update():
    try:
        n1=input("Enter the name : ")
        a1=int(input("Enter the  updated age : "))

        db.TYITCOL.update_one(
            {"name":n1},{"$set":{"age":a1}})
        print("Updated successfully")
    except Exception:
        print(str(e))
update()
