package Java0704;

public class BookTest {

	public static void main(String[] args) {
		
		Book[] book = new Book[5];
		Book[] copyBook = new Book[5];
		
		book[0] = new Book("태백산맥1","조정래");
		book[1] = new Book("태백산맥2","조정래");
		book[2] = new Book("태백산맥3","조정래");
		book[3] = new Book("태백산맥4","조정래");
		book[4] = new Book("태백산맥5","조정래");
		
		book[2] = new Book("산맥3","조정");
		System.arraycopy(book, 0, copyBook, 0, 5);
		
		book[3] = new Book("산맥3","조정");
		
		for (Book book1 : book) {
			System.out.println(book1);
			book1.showInfo();
			
		}
		
		for (Book book1 : copyBook) {
			System.out.println(book1);
			book1.showInfo();
		}
		
	}
}
