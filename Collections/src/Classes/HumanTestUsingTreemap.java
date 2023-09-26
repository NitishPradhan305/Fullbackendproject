package Classes;

import java.util.Map;
import java.util.TreeMap;

import enitities.Human;

public class HumanTestUsingTreemap {

	public static void main(String[] args) {
		TreeMap<Integer,Human> map = new TreeMap<>();
		map.put(4, new Human(3, "Nitish", 45));
		map.put(2, new Human(5, "John", 67));
		map.put(8, new Human(5, "Janny", 89));
		map.put(1, new Human(9, "Mike", 34));
		
		for (Map.Entry<Integer,Human> man : map.entrySet()) {
			System.out.println(man.getKey()+"------"+man.getValue());
		}

	}

}
