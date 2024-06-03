class BankAccount:
    all_accounts = []

    def __init__(self, int_rate, balance=0):
        self.balance = balance
        self.int_rate = int_rate
        BankAccount.all_accounts.append(self)

    def deposit(self, amount):
        self.balance += amount
        return self

    def withdraw(self, amount):
        if self.balance >= amount:
            self.balance -= amount
        else:
            print("Insufficient funds: Charging a $5 fee")
            self.balance -= 5
        return self

    def display_account_info(self):
        print(f"Balance: ${self.balance}")
        return self

    def yield_interest(self):
        if self.balance > 0:
            self.balance += self.balance * self.int_rate
        return self

    @classmethod
    def display_all_accounts(cls):
        for account in cls.all_accounts:
            account.display_account_info()


account1 = BankAccount(0.01, 100)
account2 = BankAccount(0.02)


account1.deposit(50).deposit(50).deposit(100).withdraw(200).yield_interest().display_account_info()
account2.deposit(200).deposit(300).withdraw(50).withdraw(50).withdraw(50).withdraw(50).yield_interest().display_account_info()

# Bouns 
BankAccount.display_all_accounts()
