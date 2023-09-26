package java8;

import java.util.function.Predicate;

public class TestPredicateFunction {

	public static void m1(Predicate p, int[] y) {
		for (int k : y) {
			if (p.test(k))
				System.out.println(k);
		}
	}

	public static void main(String[] args) {

		int[] x = { 8, 2, 10, 45, 23, 5, 67, 43, 40 };

		Predicate<Integer> per = (i) -> (i > 10);
		Predicate<Integer> per1 = (i) -> (i % 2 == 0);

		System.out.println("Even numbers are as follows");
		m1(per1, x);

		System.out.println("Numbers greater than 10 and are also even are as follows:-");
		m1(per.and(per1), x);

		System.out.println("Numbers either greater than 10 or are even as follows:-)");
		m1(per.or(per1), x);
		
		System.out.println("Numbers not greater than 10 are :-");
		m1(per.negate(),x);
	}

}
