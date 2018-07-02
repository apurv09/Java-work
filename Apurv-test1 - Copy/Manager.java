
public class Manager extends Employee{

	Manager(long id, String Name, String address, long phone,double salary) {
		super(id, Name, address, phone);
		basicSalary=salary;
		Hra=30;
		specialAllowance=15;
	}

}
