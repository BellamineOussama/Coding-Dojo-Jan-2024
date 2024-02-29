from ninja import Ninja
from pet import Pet

# Assuming pet_food is a dictionary with types of food and quantities
pet_food = {"Burger": 1, "Pizza": 1}

# Create an instance of Pet
mr_nibbles = Pet("MR. Nibbles", "Cat", ["Sit", "Roll"])

# Create an instance of Ninja with the pet instance
ninja = Ninja("Jane", "Doe", ["Bacon"], pet_food, mr_nibbles)

# Feeding MR. Nibbles different types of food
ninja.feed("Burger")
ninja.feed("Pizza")
ninja.feed("Pizza") 

