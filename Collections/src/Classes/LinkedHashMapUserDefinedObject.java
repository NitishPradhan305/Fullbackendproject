package Classes;

import java.util.LinkedHashMap;
import java.util.Map;

import enitities.Book;

public class LinkedHashMapUserDefinedObject {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer, Book> map = new LinkedHashMap<>();
		map.put(1, new Book(3,"Physics","Schand" , false));
		map.put(4, new Book(5, "Maths", "RsAgarwal", false));
		map.put(7, new Book(1, "Chemistry", "Ceengage", false));
		map.put(3, new Book(2, "Sanskrit", "Kalidas", false));
		map.put(8, new Book(2, "SSt", "Laxmikant", false));
		map.put(2, new Book(9, "Hindi", "Walmiki", false));
		
	   for (Map.Entry<Integer,Book> m : map.entrySet()) {
       System.out.println(m.getKey()+"   ,Value is :- "+m.getValue());		   
	}
	}

}
