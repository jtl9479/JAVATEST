package ch23;

import java.util.ArrayList;

import Java0704.Book;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<Book>  arrayList = new ArrayList<>(); 
		ArrayList<String> stringList = new ArrayList<>(); 
		//ctrl shift o  제네릭을 book으로 선언하여 book객체만을 받을수 있게 한다.
		//제네릭을 사용할 경우 제네릭의 메소드,필드를 사용할 수 있다.
		//제네릭을 안 할 경우 형변황을 통해서 메소드,필드를 사용해야한다. 
		arrayList.add(new Book("강륭강", "산맥"));
		arrayList.add(new Book("강륭강1", "산맥"));
		arrayList.add(new Book("강륭강2", "산맥"));
		arrayList.add(new Book("강륭강3", "산맥"));
		arrayList.add(new Book("강륭강4", "산맥"));
		arrayList.add(new Book("강륭강5", "산맥"));
		
		for (int i=0; i<arrayList.size(); i++) {
			arrayList.get(i).showInfo(); //book의 메소드를 사용할수 있다
		}
	}
}
