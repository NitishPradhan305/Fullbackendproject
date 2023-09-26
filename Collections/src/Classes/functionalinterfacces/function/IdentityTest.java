package Classes.functionalinterfacces.function;

import java.util.function.Function;

public class IdentityTest {

	public static void main(String[] args) {
   Function<Integer, Integer> fn = Function.identity();
   System.out.println(fn.apply(78));
	}

}
