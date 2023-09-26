package Classes.functionalinterfacces.predicates;

import java.util.function.Predicate;

public class UseofEndPredicate {

//	public static Predicate<String> lessthanTen = (k)->(k.length()<10);
	public static Predicate<String> greaterthanTen = new Predicate<String>() {

		@Override
		public boolean test(String t) {
			return t.length() > 10;
		}

	};

	public static boolean check(String str) {
		Predicate<String> p = (x) -> (x.contains("M"));
		boolean demo = p.and(greaterthanTen).test(str);
		return demo;
	}

	public static void main(String[] args) {

		System.out.println(check("Nitish you are great Man"));
	}

}
