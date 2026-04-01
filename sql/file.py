import pymongo
conn = pymongo.MongoClient("mongodb://localhost:27017/")
# print(conn.list_database_names())
db = conn["Student"]
# print(db.list_collection_names())
collection = db["marks"]
# print(collection.find_one())
data = {"roll_no": 2, "name": "Ali", "marks": 75}  
x = collection.insert_one(data)
if x:
    print("Data inserted successfully.")
else:
    print("Data insertion failed.")