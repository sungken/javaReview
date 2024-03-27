package ch21;

public class ObjectCopyTest2 {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		Book[] copyLibaray = new Book[5];
		
		library[0] = new Book("태백산1", "조정");
		library[1] = new Book("태백산2", "조정");
		library[2] = new Book("태백산3", "조정");
		library[3] = new Book("태백산4", "조정");
		library[4] = new Book("태백산5", "조정");
		
		copyLibaray[0] = new Book();
		copyLibaray[1] = new Book();
		copyLibaray[2] = new Book();
		copyLibaray[3] = new Book();
		copyLibaray[4] = new Book();
		
		for(int i = 0; i< library.length; i++) {
			copyLibaray[i].setTitle(library[i].getTitle());
			copyLibaray[i].setAuthor(library[i].getAuthor());
		}
		
		
		library[0].setTitle("개미");
		library[0].setAuthor("김은숙");
	
		System.out.println("== library ==");
		for( Book book : library) {
			System.out.println(book);
			book.showInfo();
		}
		
		System.out.println();
		
		System.out.println("== copy library ==");
		for( Book book : copyLibaray) {
			System.out.println(book);
			book.showInfo();
		}
		
		// 깊은 복사
		// 각각의 객체를 생성하여 그 객체의 값을 복사하여 배열이 서로 다른 객체를 가리키도록 한다.
		
		
	}//main
}//ObjectCopyTest2
