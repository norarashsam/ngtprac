from pymongo import MongoClient
client=MongoClient('localhost',27017)
db=client.TYITDB
def insert():
    try:
        
        n1=input("Enter the name : ")
        a1=int(input("Enter the age : "))
        d1=input("Enter the department : ")
        p1=int(input("Enter the pin no. : "))

        db.TYITCOL.insert_one(
            {
                "name" : n1,
                "age" : a1,
                "department" : d1,
                "pin_no" : p1
            })
        print("Inserted Successfully")
    except Exception:
        print(str(e))
insert()
    
    
