import java.util.Scanner;
public class forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int loopVal;
		int end_value=11;
		int addition=0;
		Scanner sc = new Scanner(System.in);
	/*	System.out.println("Enterr 10 nos for addition");
		
		for(loopVal=1;loopVal<end_value;loopVal++) {
			
			
			addition+=sc.nextInt();
			}
		System.out.println("addition of 10 no is "+addition);
		
		*/
		
		int num,result,sum=0;
		System.out.println("Enter a number ");
		num=sc.nextInt();
		while(num!=0) {
			if((num%10 ) %2==0)
				sum+=num%10;
				num=num/10;
		}
		System.out.println("addition is "+sum);
	}

}
