package ObjectOrientedDesign;

//Base class Account
abstract class Account {
 private String accountNumber;
 private String accountHolderName;
 protected double balance;

 public Account(String accountNumber, String accountHolderName, double balance) {
     this.accountNumber = accountNumber;
     this.accountHolderName = accountHolderName;
     this.balance = balance;
 }

 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
         System.out.println("Deposited: " + amount);
     } else {
         System.out.println("Deposit amount must be positive.");
     }
 }

 public abstract void withdraw(double amount);

 public void displayAccountDetails() {
     System.out.println("Account Number: " + accountNumber);
     System.out.println("Account Holder: " + accountHolderName);
     System.out.println("Balance: " + balance);
 }
}

//SavingsAccount class
class SavingsAccount extends Account {
 private double interestRate;

 public SavingsAccount(String accountNumber, String accountHolderName, double balance, double interestRate) {
     super(accountNumber, accountHolderName, balance);
     this.interestRate = interestRate;
 }

 public void applyInterest() {
     balance += balance * (interestRate / 100);
     System.out.println("Interest applied. New balance: " + balance);
 }

 @Override
 public void withdraw(double amount) {
     if (amount > balance) {
         System.out.println("Insufficient balance. Withdrawal denied.");
     } else {
         balance -= amount;
         System.out.println("Withdrew: " + amount);
     }
 }
}

//CurrentAccount class
class CurrentAccount extends Account {
 private double overdraftLimit;

 public CurrentAccount(String accountNumber, String accountHolderName, double balance, double overdraftLimit) {
     super(accountNumber, accountHolderName, balance);
     this.overdraftLimit = overdraftLimit;
 }

 public boolean canWithdraw(double amount) {
     return balance + overdraftLimit >= amount;
 }

 @Override
 public void withdraw(double amount) {
     if (amount > balance + overdraftLimit) {
         System.out.println("Withdrawal denied. Exceeds overdraft limit.");
     } else {
         balance -= amount;
         System.out.println("Withdrew: " + amount);
     }
 }
}

