import java.util.ArrayList;
import java.util.Collection;

public class RetainAll {

	public static void main(String[] args) {
		Collection<String> coll = new ArrayList<String>();
		coll.add("Mahesh");
		coll.add("Cric");
		coll.add("Ganesh");
		
		System.out.println(coll.size());
		coll.clear();
		System.out.println(coll);

		Collection<String> names = new ArrayList<String>();
		coll.add("Kumar");
		coll.add("Mike");
		coll.add("Mahesh");

		System.out.println(coll);
//		System.out.println(names);
 
		System.out.println("After using retainAll method :-----------");
		
		coll.retainAll(names);
		System.out.println(coll);
//		System.out.println(names);
		
	}

}
