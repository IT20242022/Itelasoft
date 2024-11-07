package ObjectOrientedDesign;

public class BankingSystem {
	 public static void main(String[] args) {
	     // Create a Savings Account
	     SavingsAccount savingsAccount = new SavingsAccount("SA12345", "John Doe", 1000, 5.0);
	     savingsAccount.displayAccountDetails();
	     savingsAccount.deposit(500);
	     savingsAccount.withdraw(200);
	     savingsAccount.applyInterest();
	     savingsAccount.withdraw(2000);  // Test insufficient balance

	     System.out.println();

	     // Create a Current Account
	     CurrentAccount currentAccount = new CurrentAccount("CA12345", "Jane Smith", 2000, 500);
	     currentAccount.displayAccountDetails();
	     currentAccount.deposit(300);
	     currentAccount.withdraw(2500);  // Should allow up to overdraft limit
	     currentAccount.withdraw(3000);  // Test overdraft limit
	 }
}