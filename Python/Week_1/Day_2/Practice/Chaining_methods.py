class User:
    def __init__(self, first_name, last_name, email, age):
        self.first_name = first_name
        self.last_name = last_name
        self.email = email
        self.age = age
        self.is_rewards_member = False
        self.gold_card_points = 0

    def display_info(self):
        print(f"Name: {self.first_name} {self.last_name}")
        print(f"Email: {self.email}")
        print(f"Age: {self.age}")
        print(f"Rewards Member: {self.is_rewards_member}")
        print(f"Gold Card Points: {self.gold_card_points}")
        return self  
    print()
    def enroll(self):
        if self.is_rewards_member:
            print("User already a member.")
        else:
            self.is_rewards_member = True
            self.gold_card_points = 200
        return self  

    def spend_points(self, amount):
        if amount > self.gold_card_points:
            print("Insufficient points")
        else:
            self.gold_card_points -= amount
        return self  

user1 = User("Oussama", "Bellamine", "oussamabellamine@gmail.com", 30)
user2 = User("Amine", "Sakly", "aminesk@gmail.com", 25)


user1.display_info().enroll().spend_points(50).display_info()
user2.enroll().spend_points(80).display_info()
