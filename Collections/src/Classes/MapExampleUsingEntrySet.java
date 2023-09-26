package Classes;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MapExampleUsingEntrySet {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "Nitish");
		map.put(9, "John");
		map.put(10, "Hello");
		map.put(5, "Pollard");
		
		
	    map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);	

		
	}

}
