package Classes;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class AllMapsClasses {

	
	public static void main(String[] args) {
		
		//Creating synchronized map
		Map<String, String> map= new HashMap<>();
		map.put("1", "Nitish");
		map.put("2", "Suraj");
		map.put("3", "Hello");
		map.put("5", "Mike");
		map.put("4", "John");
		
		Map<String, String> syncMap = Collections.synchronizedMap(map);
		System.out.println(syncMap);
		
		//Creating the concurrentHashmap 
		
		ConcurrentHashMap<Integer, String> map2 = new ConcurrentHashMap<>();
		map2.put(8, "Janny");
		map2.put(9, "Carl");
		map2.put(7, "Smith");
		
		System.out.println(map2);
	}
}
