package Classes.methodreference;

   interface Nitish{
	   void play();
   }

public class SimpleMethodReference {
	
	public static void playing() {
		System.out.println("Your name is Nitish");
	}

	public static void main(String[] args) {
		Nitish n = SimpleMethodReference::playing;
		n.play();
	}
}
