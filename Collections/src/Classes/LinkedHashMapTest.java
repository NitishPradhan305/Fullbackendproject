package Classes;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest {

	public static void main(String[] args) {

   LinkedHashMap<Integer, String> hm = new LinkedHashMap<>();
   hm.put(1, "Nitish");
   hm.put(2, "John");
   hm.put(3, "Mike");
   hm.put(9, "Janny");
   hm.put(5 ,"Carl");
   
   for (Map.Entry<Integer, String> k : hm.entrySet()) {
	System.out.println(k.getKey()+"   "+k.getValue());
}
   hm.remove(9);
   System.out.println("---------------------");
   System.out.println(hm);
	}
}
