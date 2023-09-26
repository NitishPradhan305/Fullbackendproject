package Classes.functionalinterfacces.predicates;

import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {
		
		//Predicate Chaining
		Predicate<Integer> greaterthenTen = (x)->(x>10);
		Predicate<Integer> smallerthanTwenty = (y)->(y<20);
		
		boolean k = greaterthenTen.and(smallerthanTwenty).test(17);
		System.out.println(k);
		
		boolean m = greaterthenTen.and(smallerthanTwenty).negate().test(50);
		System.out.println(m);

	}

}
