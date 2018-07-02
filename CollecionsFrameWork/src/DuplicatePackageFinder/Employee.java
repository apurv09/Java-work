package DuplicatePackageFinder;

public class Employee {

	int id;
	String name;
	
	public Employee(int id,String name) {
		this.name=name;
		this.id=id;
		
	}
	
	public boolean equals(Object obj) {
		boolean flag=false;
		Employee employee=(Employee )obj;
		//Explicit refereence casting
		
		if(employee.id==id)
			flag=true;
		return flag;
	}
	
	public int hashCode() {
		return id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
