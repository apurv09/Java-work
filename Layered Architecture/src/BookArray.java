

import java.util.Scanner;
public class BookArray {
	public static void main(String[] args) {
		Book books[]=new Book[2];
		Scanner sc=new Scanner(System.in);
	
		for(int index=0; index<books.length;index++) {
			books[index]= new Book();
		}
		for(int index1=0; index1<books.length;index1++) {
			System.out.println("Enter book id");
			books[index1].setId(sc.nextInt());
			
			System.out.println("Enter book Name");
			books[index1].setName(sc.next());
			
			System.out.println("Enter book Price");
			books[index1].setPrice(sc.nextFloat());
			
			
		}
		System.gc();
		System.out.println(books[0]);
			BookDetails bookDetails = new BookDetails();
			bookDetails.showBooksDetails(books);
		
	}
}
