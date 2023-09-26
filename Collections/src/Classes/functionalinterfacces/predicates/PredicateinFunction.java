package Classes.functionalinterfacces.predicates;

import java.util.function.Predicate;

public class PredicateinFunction {
	
	public static void simply(Integer num,Predicate<Integer> p) {
		if (p.test(num)) {
			System.out.println("The number is greater than "+9);
		}else {
			System.out.println("Smaller then 9");
		}
			
	}

	public static void main(String[] args) {
	
		simply(3, (x)->(x>9));
	}
}
