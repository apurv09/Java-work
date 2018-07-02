import java.util.Scanner;

public class LargestOf3Nos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1,num2,num3,large;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first no");
		num1 = sc.nextInt();
		System.out.println("Enter second no");
		num2 = sc.nextInt();
		System.out.println("Enter third no");
		num3 = sc.nextInt();
		large=num1;
		if(num2>large) {
			large=num2;
		}
		if(num3>large) {
			large=num3;
		}
		System.out.println(large+" is large");
/*		if (num1>num2 && num1>num3 ) {
			System.out.println(num1+"is large");
		}
		else if (num2>num1 && num2>num3 ) {
			System.out.println(num2+"is large");
		}
		else {
			System.out.println(num3+" is large");
		}
	*/
	}

}
