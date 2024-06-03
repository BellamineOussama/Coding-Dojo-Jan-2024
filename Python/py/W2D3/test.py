class Car:
    def __init__(self, data):
        self.id = data["id"]
        self.make = data["make"]
        self.model = data["model"]
        self.color = data["color"]

class Repair:
    def __init__(self, data):
        self.id = data["id"]
        self.description = data["description"]
        self.cost = data["cost"]


car_with_repair =  {'id': 1, 'make': 'Mercedes', 'model': 'Benz', 'color': '#000000',  'repairs.id': 1, 'description': 'change oil', 'cost': 200.0 , 'car_id': 1}

my_car = Car(car_with_repair)
my_repair = Repair(car_with_repair)
print(my_repair.cost)