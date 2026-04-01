import pymongo

conn = pymongo.MongoClient("mongodb://localhost:27017/")
db = conn["Student"]
collection = db["exam"]
# print(collection.find_one())
# data = [{"roll_no": 1, "name": "Ajmal", "mark1": 45, "mark2": 50, "mark3": 40},
#         {"roll_no": 2, "name": "Ali", "mark1": 35, "mark2": 43, "mark3": 44},
#         {"roll_no": 3, "name": "Amarjith", "mark1": 29, "mark2": 31, "mark3": 26},
#         {"roll_no": 4, "name": "Rashid", "mark1": 44, "mark2": 43, "mark3": 48},
#         {"roll_no": 5, "name": "Ashin", "mark1": 44, "mark2": 34, "mark3": 33},
#         {"roll_no": 6, "name": "Crysto", "mark1": 40, "mark2": 45, "mark3": 42},
#         {"roll_no": 7, "name": "Flickson", "mark1": 38, "mark2": 40, "mark3": 39},
#         {"roll_no": 8, "name": "Abhinav", "mark1": 42, "mark2": 41, "mark3": 44},
#         {"roll_no": 9, "name": "Shifas", "mark1": 36, "mark2": 38, "mark3": 37},
#         {"roll_no": 10, "name": "Safal", "mark1": 41, "mark2": 39, "mark3": 40}]
# x = collection.insert_many(data)
# if x:
#     print("Data inserted successfully.")
# else:
#     print("Data insertion failed.")


# print("name - Total Marks")
# for i in collection.find({}, {"name": 1, "mark1": 1, "mark2": 1, "mark3": 1, "_id": 0}):
#     total_marks = i["mark1"] + i["mark2"] + i["mark3"]
#     print(f"{i['name']} - {total_marks}")


# print("count" , len(list(collection.find({"mark1": {"$gt": 40}}))))


# regex = "^A"   # starts with A
# for i in collection.find({"name": {"$regex": regex}}, {"name": 1, "_id": 0}):
#     print(i["name"])


# my_query = {"roll_no": 1}
# newa_value = {"$set": {"mark1": 1000}}
# collection.update_one(my_query, newa_value)
# print(collection.find_one({"roll_no": 1}, {"name": 1, "mark1": 1, "_id": 0}))

# collection.delete_one({"roll_no": 1})
# print(collection.find_one({"roll_no": 1}, {"name": 1, "mark1": 1, "_id": 0}))


# collection.delete_many({"name": {"$regex": "^n"}})
# print(list(collection.find({}, {"name": 1, "_id": 0})))


