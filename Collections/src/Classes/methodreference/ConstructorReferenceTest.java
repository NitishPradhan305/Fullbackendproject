package Classes.methodreference;

interface Messagable {
	ConstructorReferenceTest messagetonitish(String str);
}

public class ConstructorReferenceTest {

	ConstructorReferenceTest(String str1) {
		System.out.println("You have entered to constructor");
	}

	public static void main(String[] args) {
		Messagable mg = ConstructorReferenceTest::new;
		mg.messagetonitish("Nitish");
	}

}
