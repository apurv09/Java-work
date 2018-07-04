package inheritance;

public class MainEmployees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee(1021,"bbbb",8568.02f);
		Manager manager=new Manager(1001,"Nikhu",14554.02f,4);
		
		employee.login();
		employee.logout();
		manager.showTeamSize();
		manager.computehra();
		employee.computehra();
		
		Employee empprakash = new Manager(101,"abb",45645.0f);
		empprakash.login();
	}

}
