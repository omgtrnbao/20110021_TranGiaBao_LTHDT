package bai07_trang26;

public class Administrator extends Employee{
	private String theDepartment;

	public Administrator(int thePayrollNumber, String theName, float theBasicMonthlySalary, String theDepartment) {
		super(thePayrollNumber, theName, theBasicMonthlySalary);
		this.theDepartment = theDepartment;
	}
	
	public float getMonthlySalary() {
		return getTheBasicMonthlySalary() * 1.4f;
	}

	@Override
	public String toString() {
		return String.format("| %20d | %-20s | %30s | %30s | %-30s |", getThePayrollNumber(), getTheName(), formatUSD(getTheBasicMonthlySalary())
				, formatUSD(getMonthlySalary()), getTheDepartment());
	}

	public String getTheDepartment() {
		return theDepartment;
	}

	public void setTheDepartment(String theDepartment) {
		this.theDepartment = theDepartment;
	}
}
