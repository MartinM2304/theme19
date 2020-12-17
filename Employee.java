package theme_19;

public class Employee extends Person {
	
	//office, salary, and date hired
	
	private String office;
	private int salary;
	private String dateHired;
	
	public Employee (String name, String adress, String phone, String email,String office,int salary,String dateHired ) {
		super  (name, adress, phone, email);
		this.setOffice (office);
		this.setSalary (salary);
		this.setDateHired (dateHired);
		
	}
	
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDateHired() {
		return dateHired;
	}
	public void setDateHired(String dateHired) {
		this.dateHired = dateHired;
	}
	
	public String toString() {
		return super.toString() + " Employee Office : " + this.office + " Salary : " + this.salary + " Date : " + this.dateHired;
	}

}
