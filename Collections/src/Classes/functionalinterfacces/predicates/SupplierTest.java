package Classes.functionalinterfacces.predicates;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String[] args) {
		Supplier<Double> su = () -> Math.random();
		Supplier<String> sup = () -> LocalDateTime.now().toString();
		Double d1 = su.get();
		System.out.println(d1);
		System.out.println(sup.get());
	}

}
