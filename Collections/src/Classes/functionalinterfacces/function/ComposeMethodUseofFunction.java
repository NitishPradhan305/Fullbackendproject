package Classes.functionalinterfacces.function;

import java.util.function.Function;

public class ComposeMethodUseofFunction {

	public static void main(String[] args) {
		Function<Integer,Double> fn = (n)->(n/6.0);
//		Function<Integer,Double> db = m->(m*8.0);
		Function<Integer,Integer> db = m->(8*m);
       Function<Integer, Double> compose = fn.compose(db);
       System.out.println(compose.apply(95));
	}

}
