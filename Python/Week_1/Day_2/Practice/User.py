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

    def enroll(self):
        if self.is_rewards_member:
            print("User already a member.")
            return False
        else:
            self.is_rewards_member = True
            self.gold_card_points = 200
            return True

    def spend_points(self, amount):
        if amount > self.gold_card_points:
            print("Insufficient points")
        else:
            self.gold_card_points -= amount

# Creating user instances
user1 = User("Oussama", "Bellamine", "oussamabellamine@gamil.com", 30)
user2 = User("Amine", "Sakly", "aminesk@gamil.com", 25)
user3 = User("Khaled", "Trimech", "khalidtr@gmail.com", 40)

# Displaying user info
user1.display_info()
user2.display_info()
user3.display_info()

# Enrolling and spending points
user1.enroll()
user1.spend_points(50)

user2.enroll()
user2.spend_points(80)

# Displaying user info after updates
user1.display_info()
user2.display_info()

# Bonus: Re-enrolling and overspending
user1.enroll()
user3.spend_points(40)
