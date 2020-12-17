package theme_19;

public class Student extends Person {
	
	//public static final int FRESHMAN =1;
	//public static final int SOPHMORE =2;
	//public static final int JUNIOR =3;
	//public static final int SENIOR =4;
	
	private String Status;
	
	public Student (String name, String adress, String phone, String email, String status) {
		
		super  (name, adress, phone, email);
		this.setStatus(status);
		
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}
	 
	@Override
	
	public String toString() {
		return super.toString() + " Student Status : " + this.Status;
	}
}
