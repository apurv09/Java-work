package inheritance;

public class Employee {

	
	int id;
	String name;
	float salary,hra;
	Employee(int id, String name,float salary ){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public void computehra() {
		hra=salary*0.1f;
		System.out.println("emplyee hra="+this.hra);

	}
	public void login() {
		System.out.println("In the login method");
	}
	public void logout() {
		System.out.println("In the logout method");
	}
	public void showData() {
		System.out.println(+id+""+name+" "+salary);
	}

}
