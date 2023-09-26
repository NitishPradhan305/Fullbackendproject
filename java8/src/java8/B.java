package java8;

@FunctionalInterface
interface C {
	public void sum(int x, int y);
}

public class B {

	public static void main(String[] args) {

		C c1 = (x, y) -> System.out.println(x + y);
		c1.sum(4, 8);
	}

}
