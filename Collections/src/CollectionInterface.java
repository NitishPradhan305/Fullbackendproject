import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionInterface {

	public static void main(String[] args) {
		Collection<Integer> coll = new ArrayList<Integer>();
		coll.add(1);
		List<Integer> names = new ArrayList<>();
		names.add(78);
		names.add(90);
		coll.addAll(names);
		System.out.println(coll);
//		System.out.println(coll.isEmpty());

////		using removeIf(Predicate)
//		boolean demo = coll.removeIf((x)->x%2==0);
//		System.out.println(coll);
		
		System.out.println(coll.containsAll(names));
		
		Object[] array = coll.toArray();
		System.out.println("---------------");
		for (Object object : array) {
			System.out.println(object);
		}
		
	}

}
