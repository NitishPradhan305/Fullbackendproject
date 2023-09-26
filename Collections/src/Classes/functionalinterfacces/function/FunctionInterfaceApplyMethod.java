package Classes.functionalinterfacces.function;

import java.util.function.Function;

public class FunctionInterfaceApplyMethod {

	public static void main(String[] args) {
		Function<Integer, Double> fn = (x) -> x / 2.0;
		Double db = fn.apply(67);
		System.out.println(db);
	}
}
