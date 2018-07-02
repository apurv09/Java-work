
public class indexOutOfBoundExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int prices[]= {52,69,54};
		try {
		System.out.println(prices[2]);
		System.out.println(62/10);
	}catch(Exception excp) {
		System.out.println(excp.getMessage());
	}

		
}
}