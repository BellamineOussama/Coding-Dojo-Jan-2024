
from pet import Pet

class Ninja:
    def __init__(self, first_name, last_name, treats, pet_food, pet):
        self.first_name = first_name
        self.last_name = last_name
        self.treats = treats
        self.pet_food = pet_food
        self.pet = pet

    def walk(self):
        print(f"{self.first_name} is walking {self.pet.name}.")
        self.pet.play()

    def feed(self, food):
        if self.pet_food.get(food, 0) > 0:
            self.pet_food[food] -= 1
            self.pet.eat()
        else:
            print("Oh no!!! You need more pet food!")

    def bathe(self):
        print(f"{self.first_name} is bathing {self.pet.name}.")
        self.pet.noise()
        
    
