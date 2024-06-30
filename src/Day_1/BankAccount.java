package Day_1;

public class BankAccount {
    String accountNumber;
    String accountHolderName;
    double balance;

    BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + ". New balance: $" + balance);
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }

    void transfer(BankAccount recipient) {
        if (balance >= 300.0) {
            withdraw(300.0);
            recipient.deposit(300.0);
            System.out.println("$" + 300.0 + " transferred to account number " + recipient.accountNumber);
        } else {
            System.out.println("Insufficient funds. Transfer failed.");
        }
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("123456", "John Doe", 1000.0);
        BankAccount account2 = new BankAccount("654321", "Jane Smith", 500.0);

        account1.deposit(500.0);
        account1.withdraw(200.0);

        account1.transfer(account2);

        System.out.println("Final balance of account1: $" + account1.balance);
        System.out.println("Final balance of account2: $" + account2.balance);
    }
}
