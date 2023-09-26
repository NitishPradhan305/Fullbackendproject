package Classes;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
        public static void main(String[] args) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			list.add(1);
			list.add(90);
			list.add(78);
			list.add(40);
			list.add(34);
			list.add(23);
			list.add(12);
			Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		list.remove(3);
//		System.out.println(list);
		System.out.println("-----------------------------");
		list.add(4, 98);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		}
}
