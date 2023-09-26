package Classes;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

import enitities.Book;

public class HashMapExample {

	public static void main(String[] args) {
		
		HashMap<Integer, Book> map = new HashMap<>();
		map.put(1, new Book(8, "Gita", "God", true));
		map.put(2, new Book(2, "Kuran","God", true));
		map.put(3, new Book(3, "Bible", "God", true));
		map.put(4, new Book(4, "Bharat ke khoj", "Jawaharlal Nehru", true));
		
		Set<Entry<Integer,Book>> entrySet = map.entrySet();
		for (Entry<Integer, Book> entry : entrySet) {
			Integer key = entry.getKey();
			Book book = entry.getValue();
			System.out.println(book);
			System.out.println("-------------------");
		}
		
	}

}
