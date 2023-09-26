import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Stream;

public class Collectionreturningstream {

	public static void main(String[] args) {
		Collection<Integer> coll = new ArrayList<Integer>();
		coll.add(1);
		List<Integer> names = new ArrayList<>();
		names.add(78);
		names.add(90);
		coll.addAll(names);

		System.out.println(coll);
		
//		Stream<Integer> stream = coll.parallelStream();
//		stream.forEach(System.out::println);
		
//		Stream<Integer> stream = coll.stream();
//		stream.forEach(System.out::println);
		
//	System.out.println(coll.hashCode());
		Iterator<Integer> iterator = coll.iterator();
        while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}
	}

}
