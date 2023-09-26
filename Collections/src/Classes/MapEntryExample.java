package Classes;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class MapEntryExample {
    public static void main(String[] args) {
		Map map = new HashMap<>();
		map.put(1,new Employee2(3, "Nitish", 8));
		map.put(5, new Employee2(8, "John", 34));
		
		Set entrySet = map.entrySet();
		Iterator itr = entrySet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}
}
