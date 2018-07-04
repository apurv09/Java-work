
public class MainBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book=new Book();
		book.setId(1001);
		book.setName("Java complete reference");
		book.setPrice(800.2f);
		
		System.out.println(book.getId());
		System.out.println(book.getName());
		System.out.println(book.getPrice());
	}

}
