
public class MainEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp emp= new Emp(1001,"Apurv",854655.21f);
		Emp emp1= new Emp(1002,"xyx",65985.0f);
		Emp emp2 =new Emp(1003,"BKC",564954.0f);
		Emp emp3 =new Emp(1004,"clerk2",41954.0f);
		emp.computeHra();
		emp1.computeHra(25.0f);
		emp2.computeHra(25.0f,10.0f);
		emp3.computeHra();
	}

}
