package class_problems;

public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;
    private String accountType;

    public BankAccount(String accountNumber, String accountHolder, double initialDeposit, String accountType) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        setBalance(initialDeposit);
        this.accountType = accountType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance < 0) {
            System.out.println("The initial balance cannot be negative");
            this.balance = 0;
        } else {
            this.balance = balance;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
        } else {
            System.out.println("Amount to deposit can only be positive");
        }
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Transaction denied");
            System.out.println("You have insufficient funds");
        } else {
            balance = balance - amount;
        }
    }

    public void displayBalance() {
        System.out.println("Current balance: MWK" + balance);
    }

    public void applyInterest() {
        if (accountType.equals("Savings")) {
            balance += balance * 0.05;
        } else {
            System.out.println("Account type is not eligible for interest.");
        }
    }
}
