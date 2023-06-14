package bai07_trang26;

import java.text.NumberFormat;

public abstract class Employee {
	private int thePayrollNumber;
	private String theName;
	private float theBasicMonthlySalary;
	
	public abstract float getMonthlySalary();

	public Employee(int thePayrollNumber, String theName, float theBasicMonthlySalary) {
		super();
		this.thePayrollNumber = thePayrollNumber;
		this.theName = theName;
		this.theBasicMonthlySalary = theBasicMonthlySalary;
	}

	@Override
	public String toString() {
		return String.format("| %15d | %-20c | %15c | %15c | %30c |", getThePayrollNumber(), getTheName(), formatUSD(getTheBasicMonthlySalary()));
	}
	
	public String formatUSD(float money) {
		String str = "";
		NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
	    str = currencyFormat.format(money);
	    return str;
	}

	public String getTheName() {
		return theName;
	}

	public void setTheName(String theName) {
		this.theName = theName;
	}

	public float getTheBasicMonthlySalary() {
		return theBasicMonthlySalary;
	}

	public void setTheBasicMonthlySalary(float theBasicMonthlySalary) {
		this.theBasicMonthlySalary = theBasicMonthlySalary;
	}

	public int getThePayrollNumber() {
		return thePayrollNumber;
	}	
}
