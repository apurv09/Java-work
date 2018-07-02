import java.util.Scanner;

public class arrayLargerNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int prices[]=new int[10];
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter 10nos for addition");
		for(int count=0;count<10;count++) {
			prices[count]=sc.nextInt();
			
		}
	/*	int sum=0,large=0;
		for( int count=1;count<10;count=count+2) {
			if(large<prices[count])
				large=prices[count];
			
			sum+=prices[count];
		}
		System.out.println("Sum is"+sum);
		//System.out.println("large no is"+large);
	*/int countgreater=0;
	for(int count=0;count<10;count++) {
	if(prices[count]>200)
	//	countgreater=0;
	countgreater++;
	}
	System.out.println(countgreater);
	
	for(int price:prices) {
		System.out.println(price);
	}
	}

}
