package Classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import enitities.Book;

public class SortinghashMap {

	public static void main(String[] args) {
		
		HashMap<Integer, Book> map = new HashMap<>();
		map.put(1, new Book(3,"Physics","Schand" , false));
		map.put(4, new Book(5, "Maths", "RsAgarwal", false));
		map.put(7, new Book(1, "Chemistry", "Ceengage", false));
		map.put(3, new Book(2, "Sanskrit", "Kalidas", false));
		map.put(8, new Book(2, "SSt", "Laxmikant", false));
		map.put(2, new Book(9, "Hindi", "Walmiki", false));
		
		//Sorting hashMap objects using java8
		
		Set<Entry<Integer,Book>> set = map.entrySet().stream().sorted((b1,b2)->b1.getValue().getAuthor().compareTo(b2.getValue().getAuthor())).collect(Collectors.toSet());
		  set.forEach(System.out::println);
		
		//We can reverse the order the objects using interchanging b1 and b2
		  
		  
	}

}
