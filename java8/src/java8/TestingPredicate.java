package java8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class TestingPredicate {

	public static void main(String[] args) {

		Predicate<Integer> per = (t) -> (t > 10);
		System.out.println(per.test(18));
		
		Predicate<String> per1 = (str) ->(str.length()<10);
		System.out.println(per1.test("Nitish"));
		
		
		ArrayList arr = new ArrayList();
//		arr.add("Nitish");
//		arr.add("gayle");
		Predicate<Collection> per2 = coll -> (coll.isEmpty());
		System.out.println(per2.test(arr));
		
	}

}
