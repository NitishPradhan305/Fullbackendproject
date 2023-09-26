package Classes.methodreference;

import java.util.function.BiFunction;

public class BiFunctionMethodReference {
	
	public static int summation(int a, int b) {
		return (a+b);
	}

	public static void main(String[] args) {
      BiFunction<Integer, Integer, Integer> d = BiFunctionMethodReference::summation;
      Integer num = d.apply(90, 78);
      System.out.println(num);
	}

}
