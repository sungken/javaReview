package ch21;

public class BookTest {

	public static void main(String[] args) {
		
		Book[] library = new Book[5];
		
//		for (int i=0; i<library.length; i++) {
//			System.out.println(library[i]);
//		}
		
		library[0] = new Book("태백산1", "조정");
		library[1] = new Book("태백산2", "조정");
		library[2] = new Book("태백산3", "조정");
		library[3] = new Book("태백산4", "조정");
		library[4] = new Book("태백산5", "조정");
		
		for (Book book : library) {
			System.out.println(book);
			book.showInfo();
		}
		
		
		
	}//main

}//BookTest
