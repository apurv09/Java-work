package inheritance;

public class Manager {
	int teamSize;
	Manager(int id, String name, float salary, int teamSize) {
		super(id, name, salary);
		this.teamSize=teamSize;
		// TODO Auto-generated constructor stub
	}
	public void computehra() {
		this.hra=salary*0.2f;
		System.out.println(this.hra);
	}
	public void showTeamSize()
	{
		System.out.println("Team Size:"+teamSize);
	}

}

