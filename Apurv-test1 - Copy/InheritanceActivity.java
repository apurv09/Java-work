
public class InheritanceActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager manager=new Manager(126534,"Peter","Chennai India",237844,65000f);
		manager.calculateSalary();
		Trainee trainee=new Trainee(29846,"Jack","Mumbai India",442085,45000f);
		trainee.calculateSalary();
		
	}

}
