import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratingList {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(78);
		list.add(90);
		list.add(56);
		list.add(87);
		list.add(67);

		Iterator<Integer> itr = list.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		Collections.sort(list);
		
		System.out.println("Using Listiterator :- ");
		ListIterator<Integer> listItr = list.listIterator(list.size());
		while (listItr.hasPrevious()) {
			System.out.println(listItr.previous());
		}
		
		System.out.println("Using for loop");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("Using foreachremaining");
		Iterator<Integer> itr2 = list.iterator();
		itr2.forEachRemaining(a->System.out.println(a));
		
		System.out.println("Using foreach method");
		list.forEach(System.out::println);
	}

}
