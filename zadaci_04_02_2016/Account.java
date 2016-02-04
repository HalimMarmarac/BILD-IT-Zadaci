package zadaci_04_02_2016;

/* 
 * Zadatak4
 * Account class
 */

import java.util.*;

public class Account {

	protected String Name;
	protected int Id = 0;
	protected double Balance = 0;
	protected double AnnualInterestRate = 0; // AnnualInterestRate is percentage.
	protected Date DateCreated;
	protected ArrayList<Transaction> Transactions;
	// default constructor
	public Account() {
		DateCreated = new Date();
		Transactions = new ArrayList<>();
	}
	// constructor with id and balance
	public Account(int id, double balance) {
		this();
		Id = id;
		Balance = balance;
	}
	// contructor with name, id and balance atributes
	public Account(String name, int id, double balance) {
		this(id, balance);
		Name = name;

	}
	// return account ID
	public int getId() {
		return Id;
	}
	// seting new account ID
	public void setId(int id) {
		Id = id;
	}
	// return balance
	public double getBalance() {
		return Balance;
	}
	// set new balance
	public void setBalance(double balance) {
		Balance = balance;
	}
	// ...
	public double getAnnualInterestRate() {
		return AnnualInterestRate;
	}
	// ...
	public void setAnnualInterestRate(double annualInterestRate) {
		AnnualInterestRate = annualInterestRate;
	}
	// geting date of transaction
	public Date getDateCreated() {
		return DateCreated;
	}
	// monthly interest rate in %
	public double getMonthlyInterestRate() {
		return Balance * (AnnualInterestRate / 12) / 100;
	}
	// calculating new balance after withdraw
	public void withdraw(double amount) {
		Transactions.add(new Transaction('W', amount, Balance, "withdraw"));
		Balance -= amount;
	}
	// calculating new balance after deposit
	public void deposit(double amount) {
		Transactions.add(new Transaction('D', amount, Balance, "deposit"));
		Balance += amount;
	}

	@Override
	public String toString() {
		return "Account name: " + Name + "\n" + "Interest rate: " + AnnualInterestRate + "\n" + Transactions;
	}

	public ArrayList<Transaction> getTransactions() {
		return new ArrayList<>(Transactions);
	}

}
