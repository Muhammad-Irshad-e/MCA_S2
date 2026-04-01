for i in collection.find({"gender": "female", "mark": {"$gt": 90}}, {"name.fname": 1, "name.lname": 1, "grade": 1, "mark": 1, "phone": 1, "_id": 0}):
#     print(f"{i['name']['fname']} {i['name']['lname']} - Grade: {i['grade']}, Mark: {i['mark']}, Contact: {i['phone']['no']}")
    