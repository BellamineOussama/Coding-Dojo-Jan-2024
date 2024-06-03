public class BankTest {
    public static void main(String[] args){
        //!Create 3 bank accounts
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        BankAccount account3 = new BankAccount();


        //!Deposit Test
        //account1 deposit 100
        account1.deposit("checking", 100);
        System.out.println(account1.getBalance());

        System.out.println("$$$// Total Money: $" + BankAccount.getTotalMoney());


        System.out.println("********************");

        //account2 deposit 200
        account2.deposit("savings", 200);
        System.out.println(account2.getSavingsBalance());

        System.out.println("$$$// Total Money: $" + BankAccount.getTotalMoney());

        System.out.println("********************");

        //account3 deposit 300
        account3.deposit("checking", 300);
        System.out.println(account3.getCheckingBalance());

        System.out.println("$$$// Total Money: $" + BankAccount.getTotalMoney());

        System.out.println("----------------------------------------------------");


        //!Withdrawal Test

        //account1 withdraw 50
        account1.withdraw("checking", 50);
        System.out.println(account1.getCheckingBalance());
        System.out.println("$$$// Total Money: $" + BankAccount.getTotalMoney());

        System.out.println("********************");

        //account2 withdraw 100
        account2.withdraw("checking", 100);
        System.out.println(account2.getCheckingBalance());
        System.out.println("$$$// Total Money: $" + BankAccount.getTotalMoney());

        System.out.println("********************");

        //account3 withdraw 150
        account3.withdraw("checking", 150);
        System.out.println(account3.getSavingsBalance());
        System.out.println("$$$// Total Money: $" + BankAccount.getTotalMoney());

        System.out.println("----------------------------------------------------");

        // Static Test (print the number of bank accounts and the totalMoney)
        System.out.println("Number of account :" + BankAccount.getAccounts());
        System.out.println("Total money in the Bank :$" +BankAccount.getTotalMoney());


    }
}
