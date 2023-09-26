package java8;

import java.util.function.Function;

public class TestingFunctionJava8 {

	public static void main(String[] args) {

		Function<String, Integer> fn = (str) -> (str.length());
		System.out.println(fn.apply("Nitish"));
		
		Function<Integer, Integer> fn1 = (i) -> (i*i);
		System.out.println(fn1.apply(7));
	}

}
