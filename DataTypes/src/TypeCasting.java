import java.util.Scanner;
public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			byte bnum1,bnum2;
			short bsum;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the first  no.");		
		bnum1=sc.nextByte();
		System.out.print("Enter the second  no.");
		bnum2=sc.nextByte();
		
		if (bnum1 > bnum2) {
			System.out.println(bnum1+"is greter than"+bnum2);
		}else{
			System.out.println(bnum2+"is greter than"+bnum1);
		}
			bsum =(short) (bnum1 + bnum2);
			
			System.out.println("sum="+bsum );
	}

}
