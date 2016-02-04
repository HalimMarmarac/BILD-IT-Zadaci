package zadaci_04_02_2016;

// import java.util.*;
import zadaci_04_02_2016.Account; // import Account class

public class Zadatak4 {

	public static void main(String[] args) {
		// this code is for manualy input account id and amounts ...
		/*
		Scanner in = new Scanner(System.in);
		// creating new account
		Account account = new Account();
		// input account ID
		System.out.println("Enter account ID: ");
		int Id = 0;
		try {
			Id = in.nextInt();
			if (Id < 0)
				Id *= -1;
			// just numbers no letters or any signs
		} catch (InputMismatchException e) {
			System.out.println("Wrong input! INTEGERS ONLY!\nEnter again: ");
			in.nextLine();
		}
		account.setId(Id); // set account ID
		// input deposite to account
		System.out.println("Enter deposite amount: ");
		double depositeAmount = 0;
		try {
			depositeAmount = in.nextDouble();
			if (depositeAmount < 0)
				depositeAmount *= -1;
			// just numbers no letters or any signs
		} catch (InputMismatchException e) {
			System.out.println("Wrong input! No letters or signs!\nEnter again: ");
			in.nextLine();
		}
		System.out.println("Depositing " + depositeAmount + "...");
		account.deposit(depositeAmount); // add deposite to acoount
		// seting interest rate to 3.5%
		account.setAnnualInterestRate(3.5);
		// print current account ID and balance
		System.out.println("Account ID: " + account.getId());
		System.out.println("Account Balance: " + account.getBalance());

		System.out.println("\nWithdraw funds? (y/n)? ");
		String YN = in.next();
		if (YN.equalsIgnoreCase("y")) {
			// input withdraw amount
			System.out.println("Enter withdraw amount: ");
			double Withdraw = 0;
			try {
				Withdraw = in.nextDouble();
				if (Withdraw < 0)
					Withdraw *= -1;
				// just numbers no letters or any signs
			} catch (InputMismatchException e) {
				System.out.println("Wrong input! No letters or signs!\nEnter again: ");
				in.nextLine();
			}
			System.out.println("Withdrawing " + Withdraw + "...");
			account.withdraw(Withdraw); // withdraw amount from account
		} 
		*/
		// creating account
		Account account = new Account(1122, 20000);
	    account.setAnnualInterestRate(4.5);
	    // printing id and balance
	    System.out.println("Account ID: " + account.getId());
	    System.out.println("Account Balance: " + account.getBalance());
	    // withdrawing 2500
	    System.out.println("Withdrawing $2,500...");
	    account.withdraw(2500);
	    // adding 3000 to account
	    System.out.println("Depositing $3,000...");
	    account.deposit(3000);
		
		// printing data
		System.out.println();
		System.out.println("Displaying updated info.");
		System.out.println("Account ID: " + account.getId());
		System.out.println("Account Balance: " + account.getBalance());
		System.out.println("Monthly interest rate: " + account.getMonthlyInterestRate());
		System.out.println("Date account was created: " + account.getDateCreated());

		// in.close();
	}

}
