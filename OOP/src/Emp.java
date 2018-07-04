
public class Emp {
	int id;
	float hra,salary;
	String name;
	
	Emp(int id,String name,float salary){
		this.id=id;
		this.salary=salary;
		this.name=name;
		
	}
	public void computeHra() {
		hra=0f;
		System.out.println("clerk"+hra);
	}
	public void computeHra(float hrapercent) {
		hra=0;
		hra=salary*hrapercent/100.00f;
		System.out.println("supervisor"+hra);
	}
	public void computeHra(float hrapercent,float ccapercent) {
		hra=0;
		hra=salary*hrapercent/100.00f + salary*ccapercent/100.0f;
		System.out.println("Section Incharge"+hra);
	}
}
