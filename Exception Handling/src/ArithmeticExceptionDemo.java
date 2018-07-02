import java.util.Scanner;

public class ArithmeticExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int quotient = 0,dividend,divisor;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter dividend");
		dividend=sc.nextInt();
		System.out.println("Enter divior");
		divisor=sc.nextInt();
	try {
		quotient=dividend/divisor;
	}catch(ArithmeticException excp) {
		System.err.println("Division by 0 error");
		System.out.println(excp.getMessage());
	}
	finally {
		System.out.println("In the finALLY BLOCK");
	}
		System.out.println(quotient);
		
		
	}

}
