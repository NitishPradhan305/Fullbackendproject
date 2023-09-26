package Classes;

import java.util.Map;
import java.util.TreeMap;

import enitities.Book;

public class TreemapExample {

	public static void main(String[] args) {
		TreeMap<Integer,Book> map = new TreeMap<>();
		map.put(1, new Book(3,"Physics","Schand" , false));
		map.put(4, new Book(5, "Maths", "RsAgarwal", false));
		map.put(7, new Book(1, "Chemistry", "Ceengage", false));
		map.put(3, new Book(2, "Sanskrit", "Kalidas", false));
		map.put(8, new Book(2, "SSt", "Laxmikant", false));
		map.put(2, new Book(9, "Hindi", "Walmiki", false));
		
		//sorting happens automatically in treemap in ascending order
		for (Map.Entry<Integer,Book> n : map.entrySet()) {
			System.out.println(n.getKey()+" || "+n.getValue());
		}
		
		//Reverse the sorting of the treemap
		System.out.println("descending map :- "+ map.descendingMap());
		
	}
}
