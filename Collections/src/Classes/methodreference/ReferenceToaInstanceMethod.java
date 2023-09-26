package Classes.methodreference;

interface NitishK{
	void play();
}

public class ReferenceToaInstanceMethod {
	public void playing() {
		System.out.println("You have implemented method reference to an instance method.");
	}

	public static void main(String[] args) {
		ReferenceToaInstanceMethod n = new ReferenceToaInstanceMethod();
		NitishK k = n::playing;
		k.play();

	}

}
