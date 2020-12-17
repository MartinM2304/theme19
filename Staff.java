package theme_19;

public class Staff extends Employee {
	
	private String tittle;
	
	public Staff (String name, String adress, String phone, String email,String office,int salary,String dateHired,String tittle) {
		super (name, adress, phone, email, office, salary, dateHired);
		this.tittle=tittle;
	}

	public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}
	
	public String toString () {
		return super.toString() +"His tittle:"+ this.tittle;
	}
	

}
