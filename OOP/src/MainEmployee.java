
public class MainEmployee  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee(1021,"bbbb",8568.02f);
		Manager manager=new Manager(1001,"Nikhu",14554.02f,4);
		
		employee.login();
		employee.logout();
	}

}
