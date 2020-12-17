package theme_19;

public class Faculty extends Employee {
	
	//Faculty office hours and a rank
	
	private int officeHours;
	private String rank;
	
	public Faculty (String name, String adress, String phone, String email,String office,int salary,String dateHired, int officeHours, String rank ) {
		super  (name, adress, phone, email, office, salary, dateHired);
		
		this.setOfficeHours (officeHours);
		this.setRank (rank);
		
		
	}
	
	public int getOfficeHours() {
		return officeHours;
	}
	public void setOfficeHours(int officeHours) {
		this.officeHours = officeHours;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	
	public String toString() {
		return super.toString() + " Faculty Hours : " + this.officeHours + " Rank : " + this.rank;
	}
	

}
