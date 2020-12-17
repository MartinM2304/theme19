package theme_19;

public abstract class Person_Test {

	public static void main(String[] args) {
	
		Person person = new Person ("Martin" , "Sofia" , "088888", "mmmm@gmail.com" );
		
		Student student = new Student( "Petar" , "Sofia" , "088888", "pesho123@gmail.com","Senior");
		
		Employee employee = new Employee("Nqkoi si" , "Sofia" , "088888", "NNNNNN@gmail.com","SMG" ,222, "22.12" );
		
		Faculty faculty = new Faculty ("Nqkoi si_2" , "Sofia" , "0888", "NZNNZNZNNZ@gmail.com","SMG" ,300, "22.12" , 100,"Cleaner");
		
		Staff staff = new Staff ("Nqkoi si_3" , "Sofia" , "0876", "WHO_AM_I@gmail.com","SMG" ,3000, "22.12", "Don have idea" );
		
		System.out.println(person );
		System.out.println("\n");
		System.out.println(student);
		System.out.println("\n");
		System.out.println(employee);
		System.out.println("\n");
		System.out.println(faculty);
		System.out.println("\n");
		System.out.println(staff);

	}

}
