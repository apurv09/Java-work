import java.util.*;
public class array2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[][] table=new int [3][3];
			System.out.println("Enter element for matrix");
			Scanner sc=new Scanner(System.in);
			for(int row=0;row<3;row++)
				for(int col=0;col<3;col++)
					table[row][col]=sc.nextInt();
			
			for(int row=0;row<3;row++) {
				for(int col=0;col<3;col++)
			System.out.print(table[row][col]+"\t");
			
			System.out.println();
   	}
	}

}