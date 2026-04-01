import pymongo
conn = pymongo.MongoClient("mongodb://localhost:27017/")
# print(conn.list_database_names())
db = conn["Student"]
# print(db.list_collection_names())
collection = db["students"]
# data = [{"roll_no": 1, "name": "Ahmed", "marks": 85},
#         {"roll_no": 2, "name": "Ali", "marks": 90},
#         {"roll_no": 3, "name": "Hamza", "marks": 75},
#         {"roll_no": 4, "name": "Sara", "marks": 95},
#         {"roll_no": 5, "name": "Zainab", "marks": 80}]
# x = collection.insert_many(data)
# print(list(collection.find()))
# if x:
#     print("Data inserted successfully.")
# else:
#     print("Data insertion failed.")
# print(collection.find_one({"roll_no": 3}, {"name": 1, "_id": 0}))
# for i in collection.find({}, {"name":1,"_id": 0}).sort("name", -1):
#     print(i["name"])
for i in collection.find({"marks": {"$gt": 80}}, {"name": 1,"marks": 1, "_id": 0}):
    print(i)
print(collection.find_one({"marks": max(collection.find({}, {"marks": 1, "_id": 0}), key=lambda x: x["marks"])["marks"]}))