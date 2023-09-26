package java8;

interface A {
	default void k1() {
		System.out.println("From interface A");
	};
}


interface M {
	default void k1() {
		System.out.println("From interface B");
	}
}

interface D {
	default void k1() {
		System.out.println("From interface D");
	}
}

public class AnonymousClass implements A,M,D{

	public static void main(String[] args) {

		AnonymousClass a1 = new AnonymousClass();
		a1.k1();

	}

	@Override
	public void k1() {
		D.super.k1();

	}

}
