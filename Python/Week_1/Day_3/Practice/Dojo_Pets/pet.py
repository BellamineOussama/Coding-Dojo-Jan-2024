
class Pet:
    def __init__(self, name, type, tricks, health=100, energy=100):
        self.name = name
        self.type = type
        self.tricks = tricks
        self.health = health
        self.energy = energy

    def sleep(self):
        self.energy += 25
        print(f"{self.name} is sleeping, energy increased to {self.energy}.")

    def eat(self):
        self.energy += 5
        self.health += 10
        print(f"{self.name} is eating, energy increased to {self.energy}, health increased to {self.health}.")

    def play(self):
        self.health += 5
        print(f"{self.name} is playing, health increased to {self.health}.")

    def noise(self):
        print(f"{self.name} says 'Woof!'")
