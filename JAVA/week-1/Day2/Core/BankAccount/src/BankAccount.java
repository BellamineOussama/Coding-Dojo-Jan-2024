public class BankAccount {
    // MEMBER VARIABLES
    private double checkingBalance;
    private double savingsBalance;

    private static int accounts;
    private static double totalMoney; // refers to the sum of all bank account checking and savings balances

    //!CONSTRUCTOR
    public BankAccount() {
        this.checkingBalance = 0;
        this.savingsBalance = 0;
        accounts++;
    }

    //!Getters and setters
    public double getCheckingBalance() {
        return checkingBalance;
    }

    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public static int getAccounts() {
        return accounts;
    }

    public static void setAccounts(int accounts) {
        BankAccount.accounts = accounts;
    }

    public static double getTotalMoney() {
        return totalMoney;
    }

    public static void setTotalMoney(double totalMoney) {
        BankAccount.totalMoney = totalMoney;
    }

    //!METHODS
    // deposit method
    public void deposit(String accountType, double amount) {
        if (accountType.equals("checking")) {
            this.checkingBalance += amount;
        } else if (accountType.equals("savings")) {
            this.savingsBalance += amount;
        }else{
            System.out.println("Invalid account type");
        }
        totalMoney += amount;
    }


    // withdraw method
    public void withdraw(String accountType, double amount) {
        if (accountType.equals("checking")) {
            if (this.checkingBalance - amount >= 0) {
                this.checkingBalance -= amount;
                totalMoney -= amount;
            } else {
                System.out.println("Insufficient funds");
            }
        } else if (accountType.equals("savings")) {
            if (this.savingsBalance - amount >= 0) {
                this.savingsBalance -= amount;
                totalMoney -= amount;
            } else {
                System.out.println("Insufficient funds");
            }
        }else{
            System.out.println("Invalid account type");
        }
    }

    // getBalance method
    public String getBalance() {
        return "Checking Account Balance : $" + this.checkingBalance + "\n" + "Saving Account Balance : $" + this.savingsBalance;
    }
}