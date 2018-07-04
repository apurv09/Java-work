
public class BookDetails {

	public void showBooksDetails(Book books[]) {
		for (int index=0; index<books.length;index++) {
			System.out.println(books[index].getId());
			System.out.println(books[index].getName());
			System.out.println(books[index].getPrice());
		}
	}
}
