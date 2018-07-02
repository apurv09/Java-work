package DuplicatePackageFinder;

import java.util.HashSet;

public class MainEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee kumar=new Employee(1023,"Kumar");
		Employee satish=new Employee(1024,"Satish");
		Employee lokesh=new Employee(1025,"Lokesh");
		Employee nesha=new Employee(1026,"nesha");
		Employee prasant=new Employee(1027,"Prasant");
		Employee prerana=new Employee(1027,"Prerna");
		HashSet<Employee>employeeSet=new HashSet<Employee>();
		
		employeeSet.add(kumar);
		employeeSet.add(satish);
		employeeSet.add(lokesh);
		employeeSet.add(nesha);
		employeeSet.add(prasant);
		employeeSet.add(prerana);
		
		for(Employee employee:employeeSet) {
			System.out.println(employee.getId()+" "+employee.getName());
		}
	}

}
