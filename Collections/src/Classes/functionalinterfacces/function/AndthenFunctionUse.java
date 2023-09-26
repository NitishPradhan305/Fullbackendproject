package Classes.functionalinterfacces.function;

import java.util.function.Function;

public class AndthenFunctionUse {

	public static void main(String[] args) {
		Function<Integer, Double> fn = (x) -> (x / 3.0);
		Function<Integer, Double> fn2 = fn.andThen(m -> m * 90);
		System.out.println(fn2.apply(35));
	}
}
