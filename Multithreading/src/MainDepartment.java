
public class MainDepartment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department hr=new Department("HR");
		Department it=new Department("IT");
		Department logistics=new Department("Logistics");
		hr.start();
		it.start();
		logistics.start();
		
	}

}
