package ch23;

import java.util.ArrayList;
import ch21.Book;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<Book> library = new ArrayList<Book>();
		
		library.add(new Book("개미1", "베르베르"));
		library.add(new Book("개미2", "베르베르"));
		library.add(new Book("개미3", "베르베르"));
		library.add(new Book("개미4", "베르베르"));
		library.add(new Book("개미5", "베르베르"));
		
		for(int i= 0; i<library.size(); i++) {
			library.get(i).showInfo();
		}

	}//main

}//ArrayListTest
