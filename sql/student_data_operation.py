#student data operation using test.json file
# Example json data:
# {
#   "_id": 1,
#   "name": {
#     "fname": "Athira",
#     "lname": "Krishnan"
#   },
#   "address": {
#     "house_name": "Ambadi",
#     "city": "Kollam"
#   },
#   "gender": "female",
#   "course": "MCA",
#   "mark": 80,
#   "grade": "A",
#   "phone": {
#     "type": "mobile",
#     "no": 9896321450
#   }
# }

import pymongo
client = pymongo.MongoClient("mongodb://localhost:27017/")
db = client["Student_db"]
collection = db["Students"]
# 1. display name of( both fname and lname) and mark of all female students in mca department 
# for i in collection.find({"gender": "female", "course": "MCA"}, {"name.fname": 1, "name.lname": 1, "mark": 1, "_id": 0}):
#     print(f"{i['name']['fname']} {i['name']['lname']} - {i['mark']}") 
    
# 2. display the details of student who secured highest mark in the course mca
# highest_mark = collection.find({"course": "MCA"}).sort("mark", -1).limit(1)
# for i in highest_mark:
#     print(i)
    
# 3. display all male students who secured A+
# for i in collection.find({"grade": "A+", "gender": "male"},{"name.fname": 1, "name.lname": 1, "_id": 0}):
#     print(f"{i['name']['fname']} {i['name']['lname']}")
    
# 4. display the names of the top three students in Mechanical department
# top_students = collection.find({"course": "Mechanical"}).sort("mark", -1).limit(3)
# for i in top_students:
#     print(f"{i['name']['fname']} {i['name']['lname']} - {i['mark']}")
    
# 5. display the details of female students [fname, laname, grade, mark, contact] who achieved a mark more than 90
# for i in collection.find({"gender": "female", "mark": {"$gt": 90}}, {"name.fname": 1, "name.lname": 1, "grade": 1, "mark": 1, "phone": 1, "_id": 0}):
#     print(f"{i['name']['fname']} {i['name']['lname']} - Grade: {i['grade']}, Mark: {i['mark']}, Contact: {i['phone']['no']}")
    
# 6. display the details of students who secured mark, more than 80 but less than 90
# for i in collection.find({"mark": {"$gt": 80, "$lt": 90}}, {"name.fname": 1, "name.lname": 1, "grade": 1, "mark": 1, "_id": 0}):
#     print(f"{i['name']['fname']} {i['name']['lname']} - Grade: {i['grade']}, Mark: {i['mark']}")

# 7.display the details of students whose name starts with 'V'
# for i in collection.find({"name.fname": {"$regex": "^V"}}, {"name.fname": 1, "name.lname": 1, "_id": 0}):
#     print(f"{i['name']['fname']} {i['name']['lname']}")
    
# 8. display all students from Kollam
# for i in collection.find({"address.city": "Kollam"}, {"name.fname": 1, "name.lname": 1, "_id": 0}):
#     print(f"{i['name']['fname']} {i['name']['lname']}")

# 9. display all the students who does not belong to neither kollam nor Thiruvananthapuram
# for i in collection.find({"address.city": {"$nin": ["Kollam", "Thiruvananthapuram"]}}, {"name.fname": 1, "name.lname": 1, "_id": 0}):
#     print(f"{i['name']['fname']} {i['name']['lname']}")
    
# 10. display all the students who belongs to either kollam or Thiruvananthapuram
for i in collection.find({"address.city": {"$in": ["Kollam", "Thiruvananthapuram"]}}, {"name.fname": 1, "name.lname": 1, "_id": 0}):
    print(f"{i['name']['fname']} {i['name']['lname']}")