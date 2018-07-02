
public class Employee {

	long phone,employeeId;
	String employeeName,employeeAddress;
	double basicSalary,specialAllowance,Hra;
	
	Employee(long id,String Name,String address,long phone){
		
	employeeId=id;
	employeeName=Name;
	employeeAddress=address;
	this.phone=phone;
	
	}
	public void calculateSalary(){
	double	salary=0;
		salary= basicSalary+(basicSalary * specialAllowance/100)+(basicSalary*Hra/100);
		System.out.println("Salary is"+salary);
	}
}
