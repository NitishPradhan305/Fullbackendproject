package Classes.lambdas;

interface Drawable {
	void draw();
}

public class SimpleLambdaExpression {

	public static void main(String[] args) {
		Drawable d = () -> {
			System.out.println("Draw method is called.");
		};

		d.draw();
	}
}
