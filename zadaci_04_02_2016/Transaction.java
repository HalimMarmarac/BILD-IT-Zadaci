package zadaci_04_02_2016;

/*
 *  Zadatak4
 *  Transaction class
 */

import java.util.*;

public class Transaction {

	private Date Date; // The date of this transaction.
	private char Type; // The type of the transaction, such as 'W' for
						// withdrawal, 'D' for deposit.

	private double Amount; // The amount of the transaction.
	private double Balance; // The new balance after this transaction.
	private String Description; // The description of this transaction.

	public Transaction(char type, double amount, double balance, String description) {
		Type = type;
		Amount = amount;
		Balance = balance;
		Description = description;
		Date = new Date();
	}

	public Date getDate() {
		return Date;
	}

	public char getType() {
		return Type;
	}

	public double getAmount() {
		return Amount;
	}

	public double getBalance() {
		return Balance;
	}

	public String getDescription() {
		return Description;
	}

	@Override
	public String toString() {
		return "Type: " + Type + " Date: " + Date + "Description: " + Description + "Amount: " + Amount
				+ " Balance: " + Balance + "\n";
	}
}
