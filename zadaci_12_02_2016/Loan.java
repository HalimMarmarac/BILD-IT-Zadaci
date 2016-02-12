package zadaci_12_02_2016;

/*
 * Zadatak5
 * Loan class
 */

public class Loan {

	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private java.util.Date loanDate;

	// default constructor
	public Loan() {
		this(2.5, 1, 1000);
	}

	// construct a loan with specified annual interest rate, number of years,
	// and loan amount
	public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
		if (loanAmount <= 0)
			throw new IllegalArgumentException("loanAmount must be greater than 0.");
		if (annualInterestRate <= 0)
			throw new IllegalArgumentException("annualInterestRate must be greater than 0.");
		if (numberOfYears <= 0)
			throw new IllegalArgumentException("numberOfYears must be greater than 0.");

		this.annualInterestRate = annualInterestRate;
		this.numberOfYears = numberOfYears;
		this.loanAmount = loanAmount;
		loanDate = new java.util.Date();
	}

	// return annualInterestRate
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	// set a new annualInterestRate
	public void setAnnualInterestRate(double annualInterestRate) {
		if (annualInterestRate <= 0)
			throw new IllegalArgumentException("annualInterestRate must be greater than 0.");
		this.annualInterestRate = annualInterestRate;
	}

	// return numberOfYears
	public int getNumberOfYears() {
		return numberOfYears;
	}

	// set a new numberOfYears
	public void setNumberOfYears(int numberOfYears) {
		if (numberOfYears <= 0)
			throw new IllegalArgumentException("numberOfYears must be greater than 0.");
		this.numberOfYears = numberOfYears;
	}

	// return loanAmount
	public double getLoanAmount() {
		return loanAmount;
	}

	// set a newloanAmount
	public void setLoanAmount(double loanAmount) {
		if (loanAmount <= 0)
			throw new IllegalArgumentException("loanAmount must be greater than 0.");
		this.loanAmount = loanAmount;
	}

	// find monthly payment
	public double getMonthlyPayment() {
		double monthlyInterestRate = annualInterestRate / 1200;
		double monthlyPayment = loanAmount * monthlyInterestRate
				/ (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
		return monthlyPayment;
	}

	// find total payment
	public double getTotalPayment() {
		double totalPayment = getMonthlyPayment() * numberOfYears * 12;
		return totalPayment;
	}

	// return loan date
	public java.util.Date getLoanDate() {
		return loanDate;
	}

}
